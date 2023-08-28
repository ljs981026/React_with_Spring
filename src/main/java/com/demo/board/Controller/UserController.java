package com.demo.board.Controller;

import com.demo.board.Interface.UserRepository;
import com.demo.board.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository UserRepository;

    @GetMapping("/api/user")
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    @GetMapping("/api/user2")
    public String test2() {
        return "hi";
    }

}
