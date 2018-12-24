package ua.demo.cloud.order.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import ua.demo.cloud.order.client.PaymentClient;
import ua.demo.cloud.order.fallback.PaymentClientFallback;

@Component
public class PaymentClientFallbackFactory implements FallbackFactory<PaymentClient> {
    @Override
    public PaymentClient create(Throwable throwable) {
        return new PaymentClientFallback(throwable);
    }
}
