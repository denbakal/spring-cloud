package ua.demo.cloud.order.dto;

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
    private UserDto userDto;
    @NotNull
    private ProductDto productDto;
    @NotNull
    @Positive
    private int amount;
}
