package ua.demo.cloud.order.fallback;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import ua.demo.cloud.order.client.PaymentClient;
import ua.demo.cloud.order.dto.PaymentDto;

@Log4j2
@Component
public class PaymentClientFallback implements PaymentClient {
    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
        return paymentDto;
    }
}
