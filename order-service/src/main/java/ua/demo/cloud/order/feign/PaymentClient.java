package ua.demo.cloud.order.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.demo.cloud.order.proto.model.PaymentRequestInfo;

public interface PaymentClient {
    @RequestMapping(method = RequestMethod.POST, value = "/payments", produces = "application/x-protobuf", consumes = "application/x-protobuf")
    PaymentRequestInfo.PaymentRequest createPayment(PaymentRequestInfo.PaymentRequest paymentRequest);
}
