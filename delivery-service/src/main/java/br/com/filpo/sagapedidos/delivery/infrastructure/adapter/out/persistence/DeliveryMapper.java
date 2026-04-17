package br.com.filpo.sagapedidos.delivery.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.delivery.domain.model.Delivery;

public class DeliveryMapper {

    private DeliveryMapper() {}

    public static DeliveryJpaEntity toEntity(Delivery domain) {
        return DeliveryJpaEntity.builder()
                .id(domain.getId())
                .orderId(domain.getOrderId())
                .address(domain.getAddress())
                .status(domain.getStatus())
                .failureReason(domain.getFailureReason())
                .scheduledAt(domain.getScheduledAt())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public static Delivery toDomain(DeliveryJpaEntity entity) {
        return Delivery.builder()
                .id(entity.getId())
                .orderId(entity.getOrderId())
                .address(entity.getAddress())
                .status(entity.getStatus())
                .failureReason(entity.getFailureReason())
                .scheduledAt(entity.getScheduledAt())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
