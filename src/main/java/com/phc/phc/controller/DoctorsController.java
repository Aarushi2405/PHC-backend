package com.phc.phc.controller;

import com.phc.phc.entity.Doctors;
import com.phc.phc.repository.DoctorsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DoctorsController {

    private final DoctorsRepository doctorsRepository;

    public DoctorsController(DoctorsRepository doctorsRepository){
        this.doctorsRepository = doctorsRepository;
    }

    @GetMapping("/doctors")
    public List<Doctors> getDoctors(){
        return (List<Doctors>) this.doctorsRepository.findAll();
    }

    @GetMapping("/doctor/{username}")
    public Doctors getFromUsername(@PathVariable String username){
        return (Doctors) this.doctorsRepository.findByUsername(username);
    }
}
