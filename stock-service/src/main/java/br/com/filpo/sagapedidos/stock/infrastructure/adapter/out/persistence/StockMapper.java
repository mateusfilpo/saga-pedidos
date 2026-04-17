package br.com.filpo.sagapedidos.stock.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.stock.domain.model.Product;
import br.com.filpo.sagapedidos.stock.domain.model.StockReservation;

public class StockMapper {

    private StockMapper() {}

    public static StockReservationJpaEntity toEntity(StockReservation domain) {
        return StockReservationJpaEntity.builder()
                .id(domain.getId())
                .orderId(domain.getOrderId())
                .productId(domain.getProductId())
                .quantity(domain.getQuantity())
                .status(domain.getStatus())
                .createdAt(domain.getCreatedAt())
                .updatedAt(domain.getUpdatedAt())
                .build();
    }

    public static StockReservation toDomain(StockReservationJpaEntity entity) {
        return StockReservation.builder()
                .id(entity.getId())
                .orderId(entity.getOrderId())
                .productId(entity.getProductId())
                .quantity(entity.getQuantity())
                .status(entity.getStatus())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    public static ProductJpaEntity toEntity(Product domain) {
        return ProductJpaEntity.builder()
                .id(domain.getId())
                .productId(domain.getProductId())
                .name(domain.getName())
                .availableQuantity(domain.getAvailableQuantity())
                .build();
    }

    public static Product toDomain(ProductJpaEntity entity) {
        return Product.builder()
                .id(entity.getId())
                .productId(entity.getProductId())
                .name(entity.getName())
                .availableQuantity(entity.getAvailableQuantity())
                .build();
    }
}
