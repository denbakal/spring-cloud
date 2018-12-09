package ua.demo.cloud.payment.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.cloud.payment.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
