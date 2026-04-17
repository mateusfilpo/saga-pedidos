package br.com.filpo.sagapedidos.order.domain.event;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record OrderCreatedEvent(
    UUID orderId,
    UUID customerId,
    String productId,
    Integer quantity,
    BigDecimal totalAmount,
    Instant createdAt
) {}
