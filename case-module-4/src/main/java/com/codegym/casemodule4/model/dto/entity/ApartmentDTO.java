package com.codegym.casemodule4.model.dto.entity;

import com.codegym.casemodule4.model.entity.building.Building;
import com.codegym.casemodule4.model.entity.person.Landlord;
import lombok.Data;

@Data
public class ApartmentDTO {
    private Long id;
    private String roomNumber;
    private Long area;
    private Long numberOfBedRooms;
    private Long monthlyRent;
    private Integer maxTenants;
    private Building building;
    private Landlord landlord;
}
