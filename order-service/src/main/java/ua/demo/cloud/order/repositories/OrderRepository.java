package ua.demo.cloud.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.cloud.order.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
