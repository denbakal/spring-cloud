package ua.demo.cloud.order.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ua.demo.cloud.order.dto.PaymentDto;

@Log4j2
@Component
public class PaymentClientFallback {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "createPaymentFallback")
    public PaymentDto createPayment(PaymentDto paymentRequest) {
        ResponseEntity<PaymentDto> paymentResponse =
                this.restTemplate.postForEntity("http://payment-service/payments", paymentRequest, PaymentDto.class);

        return paymentResponse.getBody();
    }

    public PaymentDto createPaymentFallback(PaymentDto paymentDto) {
        return paymentDto;
    }
}
