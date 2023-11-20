package com.codegym.casemodule4.model.service;

import com.codegym.casemodule4.model.dto.entity.ApartmentDTO;
import com.codegym.casemodule4.model.dto.entity.UserDTO;
import com.codegym.casemodule4.model.entity.building.Apartment;
import com.codegym.casemodule4.model.entity.person.User;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    List<ApartmentDTO> getApartments();
    ApartmentDTO getApartmentById(Long apartmentId);
    void save(Apartment Apartment);
    void remove(Long id);
}
