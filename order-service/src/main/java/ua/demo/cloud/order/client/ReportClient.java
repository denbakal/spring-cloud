package ua.demo.cloud.order.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "report-service")
public class ReportClient {
}
