package ua.demo.cloud.order.fallback;

import lombok.extern.log4j.Log4j2;
import ua.demo.cloud.order.client.PaymentClient;
import ua.demo.cloud.order.dto.PaymentDto;

@Log4j2
public class PaymentClientFallback implements PaymentClient {
    private final Throwable cause;

    public PaymentClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
        log.debug("Handling fallback method with cause: ", cause);
        return paymentDto;
    }
}
