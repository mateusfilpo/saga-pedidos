package br.com.filpo.sagapedidos.order.domain.model;

import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class SagaState {

    private UUID id;
    private UUID orderId;
    private OrderStatus currentStep;
    private String failureReason;
    private Instant createdAt;
    private Instant updatedAt;
}
