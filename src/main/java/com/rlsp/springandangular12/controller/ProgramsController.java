package com.rlsp.springandangular12.controller;

import java.util.List;

import com.rlsp.springandangular12.model.Program;
import com.rlsp.springandangular12.repository.ProgramsRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programs")
public class ProgramsController {

    private ProgramsRepository programsRepository;
    
    

    public ProgramsController(ProgramsRepository programsRepository) {
        this.programsRepository = programsRepository;
    }

    @GetMapping
    public List<Program> listAll() {
        return programsRepository.findAll();
    }
    
}
