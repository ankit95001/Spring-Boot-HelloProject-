package com.example.firsttask.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/hello")
public class PutRequest {
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable("firstName") String firstName, @RequestParam("lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}
