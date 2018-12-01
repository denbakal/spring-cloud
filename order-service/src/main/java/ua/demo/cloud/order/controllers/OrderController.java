package ua.demo.cloud.order.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.demo.cloud.order.services.OrderService;
import ua.demo.cloud.order.dto.OrderDto;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postOrder(@RequestBody @Valid OrderDto orderDto) {
        this.orderService.handle(orderDto);
    }
}
