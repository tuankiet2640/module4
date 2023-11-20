package com.codegym.casemodule4.model.dto.entity;

import com.codegym.casemodule4.model.entity.building.Address;
import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Address address;
    private String phoneNumber;
    private String avatar;
}
