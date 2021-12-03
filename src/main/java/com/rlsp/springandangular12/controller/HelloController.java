package com.rlsp.springandangular12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rlsp/hello")
public class HelloController {
    
    @GetMapping
    public String hello() {
        return "Hello everyone";
    }
}
