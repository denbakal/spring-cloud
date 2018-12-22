package ua.demo.cloud.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.demo.cloud.order.dto.ReportDto;

@FeignClient(name = "report-service")
public interface ReportClient {
    @RequestMapping(method = RequestMethod.POST, value = "/reports", consumes = "application/json")
    void sendReport(ReportDto reportDto);
}
