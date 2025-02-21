package com.example.firsttask.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PathVariable {
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

