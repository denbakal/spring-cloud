package ua.demo.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderDto {
    @NotNull
    private long userId;

    @NotNull
    private long serviceId;

    @NotNull
    @Positive
    private int amount;
}
