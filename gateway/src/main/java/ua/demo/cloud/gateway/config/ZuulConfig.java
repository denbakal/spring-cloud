package ua.demo.cloud.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.demo.cloud.gateway.filters.SimpleFilter;

@Configuration
public class ZuulConfig {
    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
