package ua.demo.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ua.demo.cloud.order.config.RibbonConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
