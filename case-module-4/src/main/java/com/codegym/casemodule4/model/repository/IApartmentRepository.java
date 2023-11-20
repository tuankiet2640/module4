package com.codegym.casemodule4.model.repository;

import com.codegym.casemodule4.model.entity.building.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApartmentRepository extends JpaRepository<Apartment, Long> {
}
