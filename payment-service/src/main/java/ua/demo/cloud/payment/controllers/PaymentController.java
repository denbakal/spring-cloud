package ua.demo.cloud.payment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.demo.cloud.payment.dto.PaymentDto;
import ua.demo.cloud.payment.services.PaymentService;

import javax.validation.Valid;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentDto postPayment(@RequestBody @Valid PaymentDto paymentDto) {
        return this.paymentService.pay(paymentDto);
    }
}
