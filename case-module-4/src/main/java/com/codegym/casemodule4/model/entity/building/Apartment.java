package com.codegym.casemodule4.model.entity.building;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber;
    private Long area;
    private Long numberOfBedRooms;
    private Long monthlyRent;
    private Integer maxTenants;

}
