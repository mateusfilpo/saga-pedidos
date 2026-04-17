package br.com.filpo.sagapedidos.stock.domain.port.out;

import br.com.filpo.sagapedidos.stock.domain.model.StockReservation;
import java.util.Optional;
import java.util.UUID;

public interface StockReservationRepositoryPort {
    StockReservation save(StockReservation reservation);
    Optional<StockReservation> findByOrderId(UUID orderId);
}
