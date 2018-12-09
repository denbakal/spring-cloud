package ua.demo.cloud.payment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ua.demo.cloud.payment.common.PaymentState;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class Payment {
    @Id
    private String id;
    private String orderId;
    private String userId;
    private long amount;
    private PaymentState state;
}
