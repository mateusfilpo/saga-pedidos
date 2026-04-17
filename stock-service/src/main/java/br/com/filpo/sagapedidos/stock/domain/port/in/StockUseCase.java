package br.com.filpo.sagapedidos.stock.domain.port.in;

import java.util.UUID;

public interface StockUseCase {
    void reserveStock(UUID orderId, String productId, Integer quantity);
    void releaseStock(UUID orderId);
}
