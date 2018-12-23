package ua.demo.cloud.order.config;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {
    @Bean
    public IPing ping() {
        // will ping every URL to determine the server’s availability
        return new PingUrl();
    }

    @Bean
    public IRule rule() {
        // each server is given a weight according to its average response time,
        // lesser the response time gives lesser the weight.
//        return new WeightedResponseTimeRule();
        return new ZoneAvoidanceRule();
    }
}
