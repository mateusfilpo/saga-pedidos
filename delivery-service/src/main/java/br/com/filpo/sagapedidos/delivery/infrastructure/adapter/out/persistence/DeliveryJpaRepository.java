package br.com.filpo.sagapedidos.delivery.infrastructure.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface DeliveryJpaRepository extends JpaRepository<DeliveryJpaEntity, UUID> {
    Optional<DeliveryJpaEntity> findByOrderId(UUID orderId);
}
