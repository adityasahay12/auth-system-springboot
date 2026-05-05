package com.aditya.authsystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public String registerUser() {
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser() {
        return "User logged in successfully";
    }

    @GetMapping("/test")
    public String testApi() {
        return "Protected API working";
    }
}
