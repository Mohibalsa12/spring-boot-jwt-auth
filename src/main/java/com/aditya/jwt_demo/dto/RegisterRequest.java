package com.aditya.jwt_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;
    private String lastname;  // Make sure field name is correct
    private String email;
    private String password;

    // Lombok will automatically generate getLastname() (with capital L)
    // and getFirstname() methods
}