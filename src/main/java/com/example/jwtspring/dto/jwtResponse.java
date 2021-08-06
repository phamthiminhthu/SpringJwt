package com.example.jwtspring.dto;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Getter
@Setter

public class jwtResponse {

    private String token;
    private String type = "Bearer";
    private int id;
    private String username;
    private String email;
    private List<String> roles;

    public jwtResponse(String token, int id, String username, String email, List<String> roles){
        this.email = email;
        this.id = id;
        this.username = username;
        this.token = token;
        this.roles = roles;
    }


}
