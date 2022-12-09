package com.phc.phc.controller;

import com.phc.phc.entity.NrcDoctors;
import com.phc.phc.repository.NrcDoctorsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NrcDoctorsController {

    private final NrcDoctorsRepository doctorsRepository;

    public NrcDoctorsController(NrcDoctorsRepository doctorsRepository){
        this.doctorsRepository = doctorsRepository;
    }

    @GetMapping("/nrc-doctors")
    public List<NrcDoctors> getDoctors(){
        return (List<NrcDoctors>) this.doctorsRepository.findAll();
    }

    @GetMapping("/nrc-doctor/{username}")
    public NrcDoctors getFromUsername(@PathVariable String username){
        return (NrcDoctors) this.doctorsRepository.findByUsername(username);
    }
}
