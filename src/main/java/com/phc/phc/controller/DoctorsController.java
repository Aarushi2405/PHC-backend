package com.phc.phc.controller;

import com.phc.phc.entity.Doctors;
import com.phc.phc.entity.NrcDetails;
import com.phc.phc.entity.PhcDetails;
import com.phc.phc.repository.DoctorsRepository;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/doctors")
    void addDoctor(@RequestBody Doctors doctor){

        doctor.setStatus("ACTIVE");
        this.doctorsRepository.save(doctor);
    }

    @PostMapping("/doctor-deactivate")
    void deactivate(@RequestBody int doctorId){
        Doctors doc = this.doctorsRepository.getReferenceById(doctorId);
        doc.setStatus("INACTIVE");
        this.doctorsRepository.save(doc);
    }
}
