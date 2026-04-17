package br.com.filpo.sagapedidos.stock.domain.event;

import java.time.Instant;
import java.util.UUID;

public record StockReservedEvent(
    UUID reservationId,
    UUID orderId,
    String productId,
    Integer quantity,
    Instant reservedAt
) {}
