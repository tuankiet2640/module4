package com.codegym.casemodule4.model.dto.response;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private String username;
    private String message;
    private String token;
}
