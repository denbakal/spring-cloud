package ua.demo.cloud.order.services.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.order.services.OrderService;
import ua.demo.cloud.order.dto.OrderDto;
import ua.demo.cloud.order.repositories.UserRepository;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void handle(OrderDto orderDto) {
        log.debug("Handling order request ... ");

        this.userRepository.findById(Long.toString(orderDto.getUserId()));
    }
}
