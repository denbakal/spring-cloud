package ua.demo.cloud.order.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ua.demo.cloud.order.dto.ReportDto;

@Log4j2
@Component
public class ReportClientFallback {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sendReportFallback")
    public void sendReport(ReportDto reportRequest) {
        this.restTemplate.postForEntity("http://report-service/reports", reportRequest, Void.class);
    }

    public void sendReportFallback(ReportDto reportDto) {
        log.debug("Handling fallback method ...");
    }
}
