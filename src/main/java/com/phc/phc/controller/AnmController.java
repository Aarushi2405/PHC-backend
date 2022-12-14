package com.phc.phc.controller;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.Doctors;
import com.phc.phc.repository.AnmRepository;
import com.phc.phc.repository.DoctorsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AnmController {

    private final AnmRepository anmRepository;

    public AnmController(AnmRepository anmRepository){
        this.anmRepository = anmRepository;
    }

    @GetMapping("/anms")
    public List<Anm> getAnm(){
        return (List<Anm>) this.anmRepository.findAll();
    }

    @GetMapping("/anm/{username}")
    public Anm getFromUsername(@PathVariable String username){
        return (Anm) this.anmRepository.findByUsername(username);
    }

    @PostMapping("/anms")
    void addAnm(@RequestBody Anm anm){
        anm.setStatus("ACTIVE");
        this.anmRepository.save(anm);
    }


    @PostMapping("/anm-deactivate")
    void deactivate(@RequestBody int anmId){
        Anm anm = this.anmRepository.getReferenceById(anmId);
        anm.setStatus("INACTIVE");
        this.anmRepository.save(anm);
    }
}
