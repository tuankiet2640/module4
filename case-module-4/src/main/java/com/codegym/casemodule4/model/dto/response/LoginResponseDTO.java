package com.codegym.casemodule4.model.dto.response;

import lombok.*;

@Data
public class LoginResponseDTO {
    private String message;
    private String token;

    public LoginResponseDTO(String message, String token) {
        this.message = message;
        this.token = token;
    }
}
