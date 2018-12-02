package ua.demo.cloud.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.cloud.order.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
