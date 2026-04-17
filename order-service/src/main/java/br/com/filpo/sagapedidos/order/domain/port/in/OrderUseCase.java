package br.com.filpo.sagapedidos.order.domain.port.in;

import br.com.filpo.sagapedidos.order.domain.model.Order;
import br.com.filpo.sagapedidos.order.domain.model.OrderStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface OrderUseCase {
    Order createOrder(UUID customerId, String productId, Integer quantity, BigDecimal totalAmount);
    Order getOrder(UUID orderId);
    List<Order> getAllOrders();
    void updateOrderStatus(UUID orderId, OrderStatus status);
}
