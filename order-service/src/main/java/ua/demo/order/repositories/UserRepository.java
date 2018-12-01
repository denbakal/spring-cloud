package ua.demo.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.order.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}
