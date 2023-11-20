package com.codegym.casemodule4.model.entity.building;

import com.codegym.casemodule4.model.entity.person.Landlord;
import jakarta.persistence.*;

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
    @ManyToOne
    private Building building;
    @ManyToOne
    private Landlord landlord;
}


