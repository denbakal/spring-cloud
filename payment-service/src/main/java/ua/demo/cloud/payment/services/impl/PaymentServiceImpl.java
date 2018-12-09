package ua.demo.cloud.payment.services.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.payment.common.PaymentState;
import ua.demo.cloud.payment.dto.PaymentDto;
import ua.demo.cloud.payment.entity.Payment;
import ua.demo.cloud.payment.mapper.PaymentMapper;
import ua.demo.cloud.payment.repositories.PaymentRepository;
import ua.demo.cloud.payment.services.PaymentService;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public PaymentDto pay(PaymentDto paymentDto) {
        Payment payment = this.paymentMapper.toPayment(paymentDto);
        payment.setState(PaymentState.COMPLETED);
        return this.paymentMapper.fromPayment(this.paymentRepository.save(payment));
    }
}
