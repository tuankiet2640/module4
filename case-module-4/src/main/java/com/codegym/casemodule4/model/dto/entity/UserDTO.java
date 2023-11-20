package com.codegym.casemodule4.model.dto.entity;

import com.codegym.casemodule4.model.entity.building.Address;
import com.codegym.casemodule4.model.entity.person.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Role> roles = new HashSet<Role>();

    @NotBlank
    @Column(name = "fullname", length = 200, nullable = false)
    private String fullName;

    @NotBlank
    @Column(name = "username", length = 200, nullable = false)
    private String username;

    @NotBlank
    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @NotBlank
    @Column(name = "email", length = 50, nullable = false)
    @Email
    private String email;

    @NotBlank
    @Column(name = "address")
    private Address address;

    @NotBlank
    @Column(name = "phone_number", length = 11, nullable = false)
    private String phoneNumber;

    @NotBlank
    @Column(name = "avatar",
            columnDefinition = "text", nullable = true)
    private String avatar;
}
