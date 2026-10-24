package com.harsh.jira_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Developer") String name) {
        return "Hello, " + name + "! Your Spring Boot backend is connected and running successfully.";
    }
}