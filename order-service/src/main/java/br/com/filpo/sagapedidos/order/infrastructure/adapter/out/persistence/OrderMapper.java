package br.com.filpo.sagapedidos.order.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.order.domain.model.Order;
import br.com.filpo.sagapedidos.order.domain.model.SagaState;

public class OrderMapper {

    private OrderMapper() {}

    public static OrderJpaEntity toEntity(Order domain) {
        return OrderJpaEntity.builder()
                .id(domain.getId())
                .customerId(domain.getCustomerId())
                .productId(domain.getProductId())
                .quantity(domain.getQuantity())
                .totalAmount(domain.getTotalAmount())
                .status(domain.getStatus())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public static Order toDomain(OrderJpaEntity entity) {
        return Order.builder()
                .id(entity.getId())
                .customerId(entity.getCustomerId())
                .productId(entity.getProductId())
                .quantity(entity.getQuantity())
                .totalAmount(entity.getTotalAmount())
                .status(entity.getStatus())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public static SagaStateJpaEntity toEntity(SagaState domain) {
        return SagaStateJpaEntity.builder()
                .id(domain.getId())
                .orderId(domain.getOrderId())
                .currentStep(domain.getCurrentStep())
                .failureReason(domain.getFailureReason())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public static SagaState toDomain(SagaStateJpaEntity entity) {
        return SagaState.builder()
                .id(entity.getId())
                .orderId(entity.getOrderId())
                .currentStep(entity.getCurrentStep())
                .failureReason(entity.getFailureReason())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
