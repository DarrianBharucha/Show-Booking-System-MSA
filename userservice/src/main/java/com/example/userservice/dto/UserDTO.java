package com.example.userservice.dto;

import com.example.userservice.model.User;
import lombok.Getter;

@Getter
public class UserDTO {
    private Long id;
    private String username;
    private String email;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }
}
