package br.com.filpo.sagapedidos.order.domain.event;

import java.time.Instant;
import java.util.UUID;

public record OrderCompletedEvent(
    UUID orderId,
    Instant completedAt
) {}
