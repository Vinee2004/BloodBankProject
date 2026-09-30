package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

  
    public User saveUser(User user) {
        return userRepository.save(user);
    }

   
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public String deleteUser(int id) {

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        }

        return "User not found";
    }
}