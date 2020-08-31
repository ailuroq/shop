package com.example.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String main() {
        return "hello";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/reg")
    public String registration() {
        return "reg";
    }
}
