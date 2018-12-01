package ua.demo.cloud.order.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
