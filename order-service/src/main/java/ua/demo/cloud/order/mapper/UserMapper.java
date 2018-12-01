package ua.demo.cloud.order.mapper;

import org.mapstruct.Mapper;
import ua.demo.cloud.order.dto.UserDto;
import ua.demo.cloud.order.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto fromUser(User user);
    User toUser(UserDto user);
}
