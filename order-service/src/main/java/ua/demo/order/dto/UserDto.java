package ua.demo.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;

    @Email
    private String email;
    private int age;
}
