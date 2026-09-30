package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

  
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        user.setRole("DONOR");

        return userService.saveUser(user);
    }

    
   @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}

