package br.com.filpo.sagapedidos.payment.domain.port.in;

import java.math.BigDecimal;
import java.util.UUID;

public interface PaymentUseCase {
    void processPayment(UUID orderId, BigDecimal amount);
    void refundPayment(UUID orderId);
}
