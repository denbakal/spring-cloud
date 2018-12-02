package ua.demo.cloud.order.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.demo.cloud.order.common.ProductType;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class Product {
    @Id
    private String id;
    private ProductType productType;
    private Provider provider;
    private String name;
}
