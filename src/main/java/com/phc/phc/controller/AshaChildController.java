package com.phc.phc.controller;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.repository.AshaChildRepository;
import com.phc.phc.repository.AshaWorkerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AshaChildController {

    private final AshaChildRepository ashaChildRepository;

    public AshaChildController(AshaChildRepository ashaChildRepository){
        this.ashaChildRepository = ashaChildRepository;
    }

    @GetMapping("/Asha-child")
    public List<AshaChildMapping> getAshaChildMapping(){
        return (List<AshaChildMapping>) this.ashaChildRepository.findAll();
    }

    @PostMapping("/Asha-child")
    public void addAshaChildMapping(@RequestBody AshaChildMapping ashaChildMapping){
        this.ashaChildRepository.save(ashaChildMapping);
    }
}
