package br.com.filpo.sagapedidos.delivery.domain.port.out;

import br.com.filpo.sagapedidos.delivery.domain.model.Delivery;
import java.util.Optional;
import java.util.UUID;

public interface DeliveryRepositoryPort {
    Delivery save(Delivery delivery);
    Optional<Delivery> findByOrderId(UUID orderId);
}
