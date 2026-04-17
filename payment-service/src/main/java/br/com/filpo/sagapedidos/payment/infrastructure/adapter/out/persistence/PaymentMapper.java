package br.com.filpo.sagapedidos.payment.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.payment.domain.model.Payment;

public class PaymentMapper {

    private PaymentMapper() {}

    public static PaymentJpaEntity toEntity(Payment domain) {
        return PaymentJpaEntity.builder()
                .id(domain.getId())
                .orderId(domain.getOrderId())
                .amount(domain.getAmount())
                .status(domain.getStatus())
                .failureReason(domain.getFailureReason())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public static Payment toDomain(PaymentJpaEntity entity) {
        return Payment.builder()
                .id(entity.getId())
                .orderId(entity.getOrderId())
                .amount(entity.getAmount())
                .status(entity.getStatus())
                .failureReason(entity.getFailureReason())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
