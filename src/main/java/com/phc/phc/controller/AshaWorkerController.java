package com.phc.phc.controller;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.repository.AshaChildRepository;
import com.phc.phc.repository.AshaWorkerRepository;
import com.phc.phc.repository.DischargeChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AshaWorkerController {

    private final AshaWorkerRepository ashaWorkerRepository;
    @Autowired
    public AshaWorkerController(AshaWorkerRepository ashaWorkerRepository){
        this.ashaWorkerRepository = ashaWorkerRepository;
           }

    @GetMapping("/asha-worker")
    public List<AshaWorker> getAshaWorker(){
        return (List<AshaWorker>) this.ashaWorkerRepository.findAll();
    }



}
