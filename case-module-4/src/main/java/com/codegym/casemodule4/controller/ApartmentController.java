package com.codegym.casemodule4.controller;

import com.codegym.casemodule4.model.dto.entity.ApartmentDTO;
import com.codegym.casemodule4.model.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/apartment")
@RequiredArgsConstructor
public class ApartmentController {

    @Autowired
    private final ApartmentService apartmentService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<ApartmentDTO>> getApartments(){
        return new ResponseEntity<>(apartmentService.getApartments(),HttpStatus.OK);
    }

}
