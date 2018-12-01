package ua.demo.cloud.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.cloud.order.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}
