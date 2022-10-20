package com.example.jenkinstest;

import org.springframework.web.bind.annotation.*;


@RestController
public class testcontroller {
    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "HelloWorld";

    }
}
