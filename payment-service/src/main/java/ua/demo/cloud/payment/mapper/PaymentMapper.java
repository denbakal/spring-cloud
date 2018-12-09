package ua.demo.cloud.payment.mapper;

import org.mapstruct.Mapper;
import ua.demo.cloud.payment.dto.PaymentDto;
import ua.demo.cloud.payment.entity.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDto fromPayment(Payment payment);
    Payment toPayment(PaymentDto paymentDto);
}
