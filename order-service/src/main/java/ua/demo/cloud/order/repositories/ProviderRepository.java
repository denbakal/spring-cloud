package ua.demo.cloud.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.demo.cloud.order.entity.Provider;

public interface ProviderRepository extends MongoRepository<Provider, String> {
}
