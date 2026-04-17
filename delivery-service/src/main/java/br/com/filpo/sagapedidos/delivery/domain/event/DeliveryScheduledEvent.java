package br.com.filpo.sagapedidos.delivery.domain.event;

import java.time.Instant;
import java.util.UUID;

public record DeliveryScheduledEvent(
    UUID deliveryId,
    UUID orderId,
    String address,
    Instant scheduledAt
) {}
