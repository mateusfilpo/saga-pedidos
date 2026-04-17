package br.com.filpo.sagapedidos.order.infrastructure.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface SagaStateJpaRepository extends JpaRepository<SagaStateJpaEntity, UUID> {
    Optional<SagaStateJpaEntity> findByOrderId(UUID orderId);
}
