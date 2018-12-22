package ua.demo.cloud.order.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.demo.cloud.order.dto.PaymentDto;

public interface PaymentClient {
    @RequestMapping(method = RequestMethod.POST, value = "/payments", consumes = "application/json")
    PaymentDto createPayment(PaymentDto paymentDto);
}
