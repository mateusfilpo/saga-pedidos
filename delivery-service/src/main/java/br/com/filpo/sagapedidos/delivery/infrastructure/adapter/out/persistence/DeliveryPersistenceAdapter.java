package br.com.filpo.sagapedidos.delivery.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.delivery.domain.model.Delivery;
import br.com.filpo.sagapedidos.delivery.domain.port.out.DeliveryRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DeliveryPersistenceAdapter implements DeliveryRepositoryPort {

    private final DeliveryJpaRepository jpaRepository;

    @Override
    public Delivery save(Delivery delivery) {
        DeliveryJpaEntity entity = DeliveryMapper.toEntity(delivery);
        DeliveryJpaEntity saved = jpaRepository.save(entity);
        return DeliveryMapper.toDomain(saved);
    }

    @Override
    public Optional<Delivery> findByOrderId(UUID orderId) {
        return jpaRepository.findByOrderId(orderId)
                .map(DeliveryMapper::toDomain);
    }
}
