package br.com.filpo.sagapedidos.stock.domain.event;

import java.time.Instant;
import java.util.UUID;

public record StockFailedEvent(
    UUID orderId,
    String productId,
    String reason,
    Instant failedAt
) {}
