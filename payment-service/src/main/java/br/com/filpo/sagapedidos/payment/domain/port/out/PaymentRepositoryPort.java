package br.com.filpo.sagapedidos.payment.domain.port.out;

import br.com.filpo.sagapedidos.payment.domain.model.Payment;
import java.util.Optional;
import java.util.UUID;

public interface PaymentRepositoryPort {
    Payment save(Payment payment);
    Optional<Payment> findByOrderId(UUID orderId);
}
