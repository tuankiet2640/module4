package com.codegym.casemodule4.model.entity.building;

import com.codegym.casemodule4.model.entity.person.Landlord;
import jakarta.persistence.*;

@Entity
@Table(name= "buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String buildingName;
    @OneToOne
    private Address address;
    @OneToOne
    private Landlord landlord;

}
