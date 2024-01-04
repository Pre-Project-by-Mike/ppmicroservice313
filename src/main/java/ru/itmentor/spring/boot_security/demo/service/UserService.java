package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    User addUser(User user);

    boolean deleteUser(Long id);

    User updateUser(Long id, User updatedUser);

    User getUserById(Long id);

    List<User> getAllUsers();
}