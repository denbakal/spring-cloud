package ua.demo.cloud.order.services.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.order.common.OrderState;
import ua.demo.cloud.order.entity.Order;
import ua.demo.cloud.order.mapper.OrderMapper;
import ua.demo.cloud.order.repositories.OrderRepository;
import ua.demo.cloud.order.services.OrderService;
import ua.demo.cloud.order.dto.OrderDto;
import ua.demo.cloud.order.repositories.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void handle(OrderDto orderDto) {
        log.debug("Handling order request ... ");

        Order order = this.orderMapper.toOrder(orderDto);
        order.setState(OrderState.IN_PROGRESS);
        order.setCreationDate(LocalDateTime.now());
        order.setPassedPayment(false);

        this.orderRepository.save(order);
    }
}
