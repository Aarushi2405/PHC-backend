package com.phc.phc.controller;

import com.phc.phc.entity.Doctors;
import com.phc.phc.entity.NrcDetails;
import com.phc.phc.entity.NrcDoctors;
import com.phc.phc.repository.NrcDoctorsRepository;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/nrc-doctors")
    void addDoctor(@RequestBody NrcDoctors doctor){

        doctor.setStatus("ACTIVE");
        this.doctorsRepository.save(doctor);
    }

    @PostMapping("/nrc-doctor-deactivate")
    void deactivate(@RequestBody int nrcDoctorId){
        NrcDoctors doctor = this.doctorsRepository.getReferenceById(nrcDoctorId);
        doctor.setStatus("INACTIVE");
        this.doctorsRepository.save(doctor);
    }
}
