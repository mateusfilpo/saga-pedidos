package br.com.filpo.sagapedidos.order.domain.event;

import java.time.Instant;
import java.util.UUID;

public record OrderCancelledEvent(
    UUID orderId,
    String reason,
    Instant cancelledAt
) {}
