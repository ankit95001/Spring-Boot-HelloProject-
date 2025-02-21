package com.example.firsttask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestParamData {
    @GetMapping("/param/{name}")
    public String print(@PathVariable("name") String name ){
        return "Hello "+name;
    }
}
