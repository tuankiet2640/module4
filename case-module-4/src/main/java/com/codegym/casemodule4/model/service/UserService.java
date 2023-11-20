package com.codegym.casemodule4.model.service;

import com.codegym.casemodule4.model.dto.entity.UserDTO;
import com.codegym.casemodule4.model.entity.person.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDTO> getUsers();
    UserDTO getUserById(Long userId);
    void save(UserDTO UserDTO);
    void remove(Long id);
    UserDTO findUserByUsername(String username);
    UserDTO findUserByEmail(String email);
}
