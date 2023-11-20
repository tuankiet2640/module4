package com.codegym.casemodule4.model.service.impl;

import com.codegym.casemodule4.model.dto.entity.ApartmentDTO;
import com.codegym.casemodule4.model.dto.entity.UserDTO;
import com.codegym.casemodule4.model.entity.building.Apartment;
import com.codegym.casemodule4.model.entity.person.User;
import com.codegym.casemodule4.model.repository.IApartmentRepository;
import com.codegym.casemodule4.model.service.ApartmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service @Transactional @RequiredArgsConstructor
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private final IApartmentRepository apartmentRepository;
    @Autowired
    private final ModelMapper modelMapper;
    @Override
    public List<ApartmentDTO> getApartments() {
         List<Apartment> apartmentEntities= apartmentRepository.findAll();
        return StreamSupport.stream(apartmentEntities.spliterator(), true)
                .map(entity -> modelMapper.map(apartmentEntities, ApartmentDTO.class))
                .collect(Collectors.toList());

    }

    @Override
    public ApartmentDTO getApartmentById(Long apartmentId) {
            Apartment apartment = apartmentRepository.findById(apartmentId).orElse(null);
            return modelMapper.map(apartment, ApartmentDTO.class);
    }

    @Override
    public void save(Apartment Apartment) {

    }

    @Override
    public void remove(Long id) {

    }
}
