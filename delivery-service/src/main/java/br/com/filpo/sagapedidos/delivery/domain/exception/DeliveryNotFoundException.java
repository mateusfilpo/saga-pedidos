package br.com.filpo.sagapedidos.delivery.domain.exception;

import java.util.UUID;

public class DeliveryNotFoundException extends RuntimeException {
    public DeliveryNotFoundException(UUID orderId) {
        super("Delivery not found for order: " + orderId);
    }
}
