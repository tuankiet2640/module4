package com.codegym.casemodule4.controller;

import com.codegym.casemodule4.model.dto.entity.UserDTO;
import com.codegym.casemodule4.model.dto.request.LoginRequestDTO;
import com.codegym.casemodule4.model.dto.response.LoginResponseDTO;
import com.codegym.casemodule4.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class AuthController {

    @Autowired
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {

        UserDTO user = userService.findUserByUsername(request.getUsername());

        if (user == null || !(request.getPassword().equals(user.getPassword()))) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        LoginResponseDTO response = new LoginResponseDTO();
        response.setUsername(request.getUsername());
        response.setMessage("dang nhap thanh cong");
        return ResponseEntity.ok(response);
    }

}
