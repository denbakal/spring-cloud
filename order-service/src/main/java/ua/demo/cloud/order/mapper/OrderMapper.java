package ua.demo.cloud.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ua.demo.cloud.order.dto.OrderDto;
import ua.demo.cloud.order.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mappings({
            @Mapping(target = "userDto", source = "user"),
            @Mapping(target = "productDto", source = "product")
    })
    OrderDto fromOrder(Order order);

    @Mappings({
            @Mapping(target = "user", source = "userDto"),
            @Mapping(target = "product", source = "productDto")
    })
    Order toOrder(OrderDto orderDto);
}
