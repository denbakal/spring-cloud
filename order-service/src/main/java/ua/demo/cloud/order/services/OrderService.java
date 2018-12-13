package ua.demo.cloud.order.services;

import ua.demo.cloud.order.dto.OrderDto;

public interface OrderService {
    OrderDto handle(OrderDto orderDto);

    OrderDto getOrder(String id);
}
