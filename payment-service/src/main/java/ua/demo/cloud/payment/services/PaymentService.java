package ua.demo.cloud.payment.services;

import ua.demo.cloud.payment.dto.PaymentDto;

public interface PaymentService {
    PaymentDto pay(PaymentDto paymentDto);
}
