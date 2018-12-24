package ua.demo.cloud.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.demo.cloud.order.dto.PaymentDto;
import ua.demo.cloud.order.fallback.PaymentClientFallback;

@FeignClient(name = "payment-service", fallback = PaymentClientFallback.class)
public interface PaymentClient {
    @RequestMapping(method = RequestMethod.POST, value = "/payments", consumes = "application/json")
    PaymentDto createPayment(PaymentDto paymentDto);
}
