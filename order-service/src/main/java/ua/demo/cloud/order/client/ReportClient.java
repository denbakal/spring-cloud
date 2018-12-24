package ua.demo.cloud.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.demo.cloud.order.dto.ReportDto;
import ua.demo.cloud.order.fallback.ReportClientFallback;

@FeignClient(name = "report-service", fallback = ReportClientFallback.class)
public interface ReportClient {
    @RequestMapping(method = RequestMethod.POST, value = "/reports", consumes = "application/json")
    void sendReport(ReportDto reportDto);
}
