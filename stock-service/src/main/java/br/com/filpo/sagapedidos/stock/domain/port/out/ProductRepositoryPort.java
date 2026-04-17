package br.com.filpo.sagapedidos.stock.domain.port.out;

import br.com.filpo.sagapedidos.stock.domain.model.Product;
import java.util.Optional;

public interface ProductRepositoryPort {
    Product save(Product product);
    Optional<Product> findByProductId(String productId);
}
