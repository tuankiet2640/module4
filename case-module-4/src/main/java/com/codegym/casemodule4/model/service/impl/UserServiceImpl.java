package com.codegym.casemodule4.model.service.impl;

import com.codegym.casemodule4.model.entity.person.User;
import com.codegym.casemodule4.model.repository.IUserRepository;
import com.codegym.casemodule4.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final IUserRepository userRepo;
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepo.findUserById(userId);
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(User userDto) {

    }

    @Override
    public void remove(Long id) {

    }

}
