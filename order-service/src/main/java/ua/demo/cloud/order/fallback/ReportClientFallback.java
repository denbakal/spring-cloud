package ua.demo.cloud.order.fallback;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import ua.demo.cloud.order.client.ReportClient;
import ua.demo.cloud.order.dto.ReportDto;

@Log4j2
@Component
public class ReportClientFallback implements ReportClient {
    @Override
    public void sendReport(ReportDto reportDto) {
        log.debug("Handling fallback method ...");
    }
}
