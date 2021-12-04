package com.rlsp.springandangular12.repository;

import com.rlsp.springandangular12.model.Program;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramsRepository extends JpaRepository<Program, Long> {
    
}
