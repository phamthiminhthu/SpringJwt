package com.example.jwtspring.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
