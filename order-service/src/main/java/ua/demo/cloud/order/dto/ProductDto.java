package ua.demo.cloud.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.demo.cloud.order.common.ProductType;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductDto {
    private String id;
    private ProductType productType;
    @NotNull
    private ProviderDto provider;
    private String name;
}
