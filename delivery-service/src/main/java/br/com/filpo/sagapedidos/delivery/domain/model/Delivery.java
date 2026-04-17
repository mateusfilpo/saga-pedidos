package br.com.filpo.sagapedidos.delivery.domain.model;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Delivery {

    private UUID id;
    private UUID orderId;
    private String address;
    private DeliveryStatus status;
    private String failureReason;
    private Instant scheduledAt;
    private Instant createdAt;
    private Instant updatedAt;
}
