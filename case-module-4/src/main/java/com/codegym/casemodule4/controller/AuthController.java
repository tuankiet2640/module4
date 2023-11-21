package com.codegym.casemodule4.controller;

import com.codegym.casemodule4.model.dto.request.LoginRequestDTO;
import com.codegym.casemodule4.model.dto.response.LoginResponseDTO;
import com.codegym.casemodule4.security.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
@RequestMapping("/api")
public class AuthController {
    private AuthenticationManager authManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO request) {
        try {
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
            if (authentication.isAuthenticated()) {
                String token = jwtTokenProvider.generateToken(authentication);
                return new ResponseEntity<>(new LoginResponseDTO("Đăng nhập thành công!", token), HttpStatus.OK);
            }
        } catch (AuthenticationException e) {
            return new ResponseEntity<>(new LoginResponseDTO("Đăng nhập thất bại!", null), HttpStatus.BAD_REQUEST);
        }
        return null;
    }


}