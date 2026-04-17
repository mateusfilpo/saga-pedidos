package br.com.filpo.sagapedidos.order.domain.port.out;

public interface EventPublisherPort {
    void publish(String topic, String key, Object event);
}
