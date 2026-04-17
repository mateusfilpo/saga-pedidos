package br.com.filpo.sagapedidos.stock.domain.port.out;

public interface EventPublisherPort {
    void publish(String topic, String key, Object event);
}
