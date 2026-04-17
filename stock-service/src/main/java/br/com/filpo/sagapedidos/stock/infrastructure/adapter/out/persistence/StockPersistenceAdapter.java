package br.com.filpo.sagapedidos.stock.infrastructure.adapter.out.persistence;

import br.com.filpo.sagapedidos.stock.domain.model.Product;
import br.com.filpo.sagapedidos.stock.domain.model.StockReservation;
import br.com.filpo.sagapedidos.stock.domain.port.out.ProductRepositoryPort;
import br.com.filpo.sagapedidos.stock.domain.port.out.StockReservationRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class StockPersistenceAdapter implements StockReservationRepositoryPort, ProductRepositoryPort {

    private final StockReservationJpaRepository reservationJpaRepository;
    private final ProductJpaRepository productJpaRepository;

    @Override
    public StockReservation save(StockReservation reservation) {
        StockReservationJpaEntity entity = StockMapper.toEntity(reservation);
        StockReservationJpaEntity saved = reservationJpaRepository.save(entity);
        return StockMapper.toDomain(saved);
    }

    @Override
    public Optional<StockReservation> findByOrderId(UUID orderId) {
        return reservationJpaRepository.findByOrderId(orderId)
                .map(StockMapper::toDomain);
    }

    @Override
    public Product save(Product product) {
        ProductJpaEntity entity = StockMapper.toEntity(product);
        ProductJpaEntity saved = productJpaRepository.save(entity);
        return StockMapper.toDomain(saved);
    }

    @Override
    public Optional<Product> findByProductId(String productId) {
        return productJpaRepository.findByProductId(productId)
                .map(StockMapper::toDomain);
    }
}
