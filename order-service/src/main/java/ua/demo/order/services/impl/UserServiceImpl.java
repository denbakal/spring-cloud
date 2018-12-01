package ua.demo.order.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.order.dto.UserDto;
import ua.demo.order.entity.User;
import ua.demo.order.mapper.UserMapper;
import ua.demo.order.repositories.UserRepository;
import ua.demo.order.services.UserService;

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
