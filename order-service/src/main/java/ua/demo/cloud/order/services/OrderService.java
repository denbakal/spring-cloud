package ua.demo.cloud.order.services;

import ua.demo.cloud.order.dto.OrderDto;

public interface OrderService {
    void handle(OrderDto orderDto);
}
