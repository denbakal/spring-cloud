package ua.demo.cloud.payment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.demo.cloud.payment.common.PaymentState;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PaymentDto {
    @NotNull
    private String orderId;

    @NotNull
    private String userId;

    @Positive
    private long amount;

    private PaymentState state;
}
