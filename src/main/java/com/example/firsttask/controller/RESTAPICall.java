package com.example.firsttask.controller;


import com.example.firsttask.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RESTAPICall {
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
