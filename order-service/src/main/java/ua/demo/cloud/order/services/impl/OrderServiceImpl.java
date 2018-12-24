package ua.demo.cloud.order.services.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.demo.cloud.order.common.OrderState;
import ua.demo.cloud.order.common.PaymentState;
import ua.demo.cloud.order.dto.PaymentDto;
import ua.demo.cloud.order.dto.ReportDto;
import ua.demo.cloud.order.entity.Order;
import ua.demo.cloud.order.entity.User;
import ua.demo.cloud.order.fallback.PaymentClientFallback;
import ua.demo.cloud.order.fallback.ReportClientFallback;
import ua.demo.cloud.order.mapper.OrderMapper;
import ua.demo.cloud.order.repositories.OrderRepository;
import ua.demo.cloud.order.services.OrderService;
import ua.demo.cloud.order.dto.OrderDto;
import ua.demo.cloud.order.repositories.UserRepository;

import java.time.LocalDateTime;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PaymentClientFallback paymentClientFallback;

    @Autowired
    private ReportClientFallback reportClientFallback;

    @Override
    public OrderDto handle(OrderDto orderDto) {
        log.debug("Handling order request ... ");

        Order order = this.orderMapper.toOrder(orderDto);
        order.setState(OrderState.PENDING_PAYMENT);
        order.setCreationDate(LocalDateTime.now());
        order.setPassedPayment(false);
        order = this.orderRepository.save(order);

        User currentUser = this.userRepository.findByEmail(order.getUser().getEmail());

        PaymentDto paymentRequest = new PaymentDto();
        paymentRequest.setAmount(orderDto.getAmount());
        paymentRequest.setUserId(currentUser.getId());
        paymentRequest.setOrderId(order.getId());
        paymentRequest.setState(PaymentState.PENDING);

        PaymentDto payment = this.paymentClientFallback.createPayment(paymentRequest);

        if (payment != null && payment.getState() == PaymentState.COMPLETED) {
            order.setPassedPayment(true);
            order.setState(OrderState.COMPLETED);

            ReportDto reportRequest = new ReportDto();
            reportRequest.setOrderId(order.getId());
            reportRequest.setCompletedTime(LocalDateTime.now());

            this.reportClientFallback.sendReport(reportRequest);
        }
        return this.orderMapper.fromOrder(this.orderRepository.save(order));
    }

    @Override
    public OrderDto getOrder(String id) {
        return this.orderMapper.fromOrder(this.orderRepository.findById(id).orElse(null));
    }
}
