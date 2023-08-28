package com.demo.board.Controller;

import com.demo.board.Interface.UserRepository;
import com.demo.board.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BoardController {

    @GetMapping("/api/data")
    public String test() {
        return "Hello, World!";
    }

}
