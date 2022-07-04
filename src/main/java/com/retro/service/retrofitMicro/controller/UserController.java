package com.retro.service.retrofitMicro.controller;



import com.retro.service.retrofitMicro.dto.User;
import com.retro.service.retrofitMicro.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping("/getAllUser")
    public List<User> getAllUser() throws IOException {
        System.out.println("in controller");
        return userService.getAll();
    }
    @GetMapping("/userById/{id}")
    public User getUserById(@PathVariable int id) throws IOException {
        return userService.getUser(id);
    }

    @PostMapping("/insertUser")
    public  User insertUser(@RequestBody User user) throws IOException {
        System.out.println("in controller");
        return userService.insertUser(user);

    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id) throws IOException {
        return userService.deletebyId(id);
    }
}
