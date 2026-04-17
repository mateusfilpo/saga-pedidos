package br.com.filpo.sagapedidos.payment.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.payment.domain.model.Payment;
import br.com.filpo.sagapedidos.payment.domain.port.out.PaymentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PaymentPersistenceAdapter implements PaymentRepositoryPort {

    private final PaymentJpaRepository jpaRepository;

    @Override
    public Payment save(Payment payment) {
        PaymentJpaEntity entity = PaymentMapper.toEntity(payment);
        PaymentJpaEntity saved = jpaRepository.save(entity);
        return PaymentMapper.toDomain(saved);
    }

    @Override
    public Optional<Payment> findByOrderId(UUID orderId) {
        return jpaRepository.findByOrderId(orderId)
                .map(PaymentMapper::toDomain);
    }
}
