package com.example.jwtspring.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public content";
    }
    @GetMapping("/user")
    @PreAuthorize("hasRole('STUDENT') OR hasRole('ADMIN') OR hasRole('MEMBER')")
    public String userAccess(){
        return "User content";
    }

    @GetMapping("/member")
    @PreAuthorize("hasRole('MEMBER')")
    public String memberAccess(){
        return "member access";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess(){
        return "admin access";
    }

}
