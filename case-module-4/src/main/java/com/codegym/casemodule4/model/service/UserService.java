package com.codegym.casemodule4.model.service;

import com.codegym.casemodule4.model.entity.person.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    User getUserById(Long userId);
    Iterable<User> findAll();
    Optional<User> findById(Long id);
    void save(User userDto);
    void remove(Long id);
}
