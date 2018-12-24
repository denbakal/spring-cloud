package ua.demo.cloud.order.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import ua.demo.cloud.order.client.ReportClient;
import ua.demo.cloud.order.fallback.ReportClientFallback;

@Component
public class ReportClientFallbackFactory implements FallbackFactory<ReportClient> {
    @Override
    public ReportClient create(Throwable throwable) {
        return new ReportClientFallback(throwable);
    }
}
