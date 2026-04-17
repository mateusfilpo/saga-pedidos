package br.com.filpo.sagapedidos.stock.domain.model;

import lombok.*;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Product {

    private UUID id;
    private String productId;
    private String name;
    private Integer availableQuantity;
}
