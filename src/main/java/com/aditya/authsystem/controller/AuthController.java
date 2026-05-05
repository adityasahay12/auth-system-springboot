package com.aditya.authsystem.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.aditya.authsystem.service.AuthService;
import com.aditya.authsystem.model.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String loginUser() {
        return authService.login("", "");
    }

    @GetMapping("/test")
    public String testApi() {
        return "Protected API working";
    }
}
