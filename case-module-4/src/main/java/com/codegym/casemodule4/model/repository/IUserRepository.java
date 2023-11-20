package com.codegym.casemodule4.model.repository;

import com.codegym.casemodule4.model.dto.entity.UserDTO;
import com.codegym.casemodule4.model.entity.person.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findUserById(Long userId);
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
