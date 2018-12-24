package ua.demo.cloud.order.fallback;

import lombok.extern.log4j.Log4j2;
import ua.demo.cloud.order.client.ReportClient;
import ua.demo.cloud.order.dto.ReportDto;

@Log4j2
public class ReportClientFallback implements ReportClient {
    private final Throwable cause;

    public ReportClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public void sendReport(ReportDto reportDto) {
        log.debug("Handling fallback method with cause: ", cause);
    }
}
