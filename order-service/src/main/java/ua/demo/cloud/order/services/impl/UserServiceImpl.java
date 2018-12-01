package ua.demo.cloud.order.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.order.mapper.UserMapper;
import ua.demo.cloud.order.dto.UserDto;
import ua.demo.cloud.order.entity.User;
import ua.demo.cloud.order.repositories.UserRepository;
import ua.demo.cloud.order.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto save(UserDto userDto) {
        User newUser = this.userRepository.save(this.userMapper.toUser(userDto));
        return this.userMapper.fromUser(newUser);
    }
}
