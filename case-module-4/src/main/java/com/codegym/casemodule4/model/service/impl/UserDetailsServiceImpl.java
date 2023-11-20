package com.codegym.casemodule4.model.service.impl;

import com.codegym.casemodule4.model.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class UserDetailsServiceImpl {
    @Autowired
    private final IUserRepository userRepo;

    public UserDetails loadUserByUsername(String username) {

//        UserDetails user = new org.springframework.security.core.userdetails.User(username,password,authorities)
        return null;
    }
}
