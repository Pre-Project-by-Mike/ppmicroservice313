package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepo;

    @Autowired
    public void setUserRepo(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User addUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
       return userRepo.saveAndFlush(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        userRepo.deleteById(id);
        return false;
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        User userToBeUpdated = getUserById(id);
        userToBeUpdated.setUsername(updatedUser.getUsername());
        userToBeUpdated.setPassword(updatedUser.getPassword());
        userToBeUpdated.setRoles(updatedUser.getRoles());
        return userToBeUpdated;
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.getUserByUsername(username);
    }
}