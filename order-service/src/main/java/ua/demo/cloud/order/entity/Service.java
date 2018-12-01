package ua.demo.cloud.order.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.demo.cloud.order.common.ServiceType;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class Service {
    @Id
    private String id;
    private ServiceType serviceType;
    private Provider provider;
    private String name;
}
