package com.codegym.casemodule4.model.entity.person;


import com.codegym.casemodule4.model.entity.building.Apartment;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Landlord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "landlord_roles",
            joinColumns = @JoinColumn(name = "landlord_id"),
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
    private String address;

    @NotBlank
    @Column(name = "phone_number", length = 11, nullable = false)
    private String phoneNumber;

    @NotBlank
    @Column(name = "avatar",
            columnDefinition = "text", nullable = true)
    private String avatar;

    @OneToMany(mappedBy="landlord")
    private List<Apartment> apartments;

    @Column(name = "activated", nullable = true)
    private Boolean activated;

    @Column(name = "remember_token", length = 255, nullable = true)
    private String rememberToken;

}
