package br.com.filpo.sagapedidos.order.domain.model;

public enum OrderStatus {
    PENDING,
    PAYMENT_PROCESSING,
    PAYMENT_APPROVED,
    STOCK_RESERVING,
    STOCK_RESERVED,
    DELIVERY_SCHEDULING,
    COMPLETED,
    PAYMENT_FAILED,
    STOCK_FAILED,
    DELIVERY_FAILED,
    COMPENSATING,
    CANCELLED
}
