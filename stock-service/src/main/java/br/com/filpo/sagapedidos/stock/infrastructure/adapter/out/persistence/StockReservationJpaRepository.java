package br.com.filpo.sagapedidos.stock.infrastructure.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface StockReservationJpaRepository extends JpaRepository<StockReservationJpaEntity, UUID> {
    Optional<StockReservationJpaEntity> findByOrderId(UUID orderId);
}
