package br.com.filpo.sagapedidos.stock.domain.model;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class StockReservation {

    private UUID id;
    private UUID orderId;
    private String productId;
    private Integer quantity;
    private StockStatus status;
    private Instant createdAt;
    private Instant updatedAt;
}
