package ua.demo.cloud.order.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.demo.cloud.order.common.OrderState;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class Order {
    @Id
    private String id;
    private OrderState state;
    private Product product;
    private User user;
    private LocalDate creationDate;
    private boolean isPassedPayment;
}
