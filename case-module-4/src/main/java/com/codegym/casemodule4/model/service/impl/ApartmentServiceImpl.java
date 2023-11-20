package com.codegym.casemodule4.model.service.impl;

import com.codegym.casemodule4.model.entity.building.Apartment;
import com.codegym.casemodule4.model.repository.IApartmentRepository;
import com.codegym.casemodule4.model.service.ApartmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @Transactional @RequiredArgsConstructor
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private final IApartmentRepository apartmentRepository;

    @Override
    public List<Apartment> getApartments() {
        return apartmentRepository.findAll();
    }

    @Override
    public Apartment getApartmentById(Long apartmentId) {
        return null;
    }

    @Override
    public void save(Apartment Apartment) {

    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }
}
