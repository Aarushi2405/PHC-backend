package com.phc.phc.controller;

import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import com.phc.phc.repository.DischargeChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DischargeChildController {

    private final DischargeChildRepository dischargeChildRepository;

    @Autowired
    public DischargeChildController(DischargeChildRepository dischargeChildRepository){
        this.dischargeChildRepository = dischargeChildRepository;
    }

    @GetMapping("/patientss")
    public List<DischargeChildDetail> getDischargeChild(){
        return (List<DischargeChildDetail>) this.dischargeChildRepository.findAll();
    }

    @GetMapping("/patients")
    public List<DischargedPatientModel> getDischarge(){
        return (List<DischargedPatientModel>) this.dischargeChildRepository.getDischarge();
    }

    @GetMapping("/patient/{dischargeId}")
    public List<DischargeDetailsModel> getDischargeSummary(@PathVariable int dischargeId){
        return (List<DischargeDetailsModel>) this.dischargeChildRepository.findByDischargeId(dischargeId);
    }


    @GetMapping("/discharge/{dischargeId}")
    public List<DischargeModel> getDischargeById(@PathVariable int dischargeId){
        return (List<DischargeModel>) this.dischargeChildRepository.getDischargeById(dischargeId);
    }

    @GetMapping("/discharge-comorbid/{dischargeId}")
    public List<String> getComorbidById(@PathVariable int dischargeId){
        return (List<String>) this.dischargeChildRepository.getComorbidById(dischargeId);
    }

    @PostMapping("/discharge-child")
    public String getDischargeChild(@RequestBody String dischargeDetails) {
        return "Discharge Details:  " + dischargeDetails;
    }




}
