package ua.demo.cloud.order.config;

import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.Feign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.demo.cloud.order.client.PaymentClient;

@Configuration
public class FeignConfig {
    @Value("${feign.payment.client.url}")
    private String paymentClientUrl;

    @Bean
    public PaymentClient paymentClient() {
        return Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(PaymentClient.class, paymentClientUrl);
    }
}
