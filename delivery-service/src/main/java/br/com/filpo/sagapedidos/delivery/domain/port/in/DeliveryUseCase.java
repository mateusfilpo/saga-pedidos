package br.com.filpo.sagapedidos.delivery.domain.port.in;

import java.util.UUID;

public interface DeliveryUseCase {
    void scheduleDelivery(UUID orderId, String address);
    void cancelDelivery(UUID orderId);
}
