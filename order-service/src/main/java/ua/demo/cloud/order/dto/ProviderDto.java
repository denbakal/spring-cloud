package ua.demo.cloud.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProviderDto {
    private String id;
    private String name;
    private String description;
    private String phone;

    @NotNull
    private long code;
}
