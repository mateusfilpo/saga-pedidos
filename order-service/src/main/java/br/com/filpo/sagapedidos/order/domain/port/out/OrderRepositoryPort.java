package br.com.filpo.sagapedidos.order.domain.port.out;

import br.com.filpo.sagapedidos.order.domain.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepositoryPort {
    Order save(Order order);
    Optional<Order> findById(UUID id);
    List<Order> findAll();
}
