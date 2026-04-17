package br.com.filpo.sagapedidos.payment.domain.event;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record PaymentApprovedEvent(
    UUID paymentId,
    UUID orderId,
    BigDecimal amount,
    Instant approvedAt
) {}
