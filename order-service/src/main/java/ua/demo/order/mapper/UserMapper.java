package ua.demo.order.mapper;

import org.mapstruct.Mapper;
import ua.demo.order.dto.UserDto;
import ua.demo.order.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto fromUser(User user);
    User toUser(UserDto user);
}
