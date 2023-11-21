package com.codegym.casemodule4.model.service;

public interface SecurityService {
    boolean isAuthenticated();
    boolean isValidToken(String token);
}
