package ua.demo.order.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.demo.order.dto.OrderDto;
import ua.demo.order.services.OrderService;

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
