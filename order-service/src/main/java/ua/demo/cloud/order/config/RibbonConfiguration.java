package ua.demo.cloud.order.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {
    @Autowired
    IClientConfig ribbonClientConfig;

    @Bean
    public IPing ribbonPing(final IClientConfig config) {
        // will ping every URL to determine the server’s availability
        // return new PingUrl();
        return new NoOpPing();
    }

    @Bean
    public IRule ribbonRule(final IClientConfig config) {
        // each server is given a weight according to its average response time,
        // lesser the response time gives lesser the weight.
        // return new WeightedResponseTimeRule();
        return new RoundRobinRule();
    }
}
