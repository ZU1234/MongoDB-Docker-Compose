package com.mongodb.service;

import com.mongodb.entitiy.User;
import com.mongodb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User save(User user) {
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(String id){
        return userRepository.getUserById(id);
    }
    public User removeById(String id){
        return userRepository.removeById(id);
    }
    public void removeAll(){
        userRepository.deleteAllBy();
    }
}
