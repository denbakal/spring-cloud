package ua.demo.order.services;

import ua.demo.order.dto.OrderDto;

public interface OrderService {
    void handle(OrderDto orderDto);
}
