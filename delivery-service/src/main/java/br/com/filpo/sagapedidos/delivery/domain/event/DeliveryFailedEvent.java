package br.com.filpo.sagapedidos.delivery.domain.event;

import java.time.Instant;
import java.util.UUID;

public record DeliveryFailedEvent(
    UUID deliveryId,
    UUID orderId,
    String reason,
    Instant failedAt
) {}
