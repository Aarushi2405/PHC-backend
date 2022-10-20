package com.phc.phc.controller;

import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import com.phc.phc.repository.DischargeChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<DischargeDetailsModel> getDischargeSummary(@PathVariable int dischargeId){
        return (Optional<DischargeDetailsModel>) this.dischargeChildRepository.findByDischargeId(dischargeId);
    }

    @GetMapping("/get-discharge/{dischargeId}")
    public Optional<DischargeModel> getDischargeSummaryById(@PathVariable int dischargeId){
        return (Optional<DischargeModel>) this.dischargeChildRepository.getDischargeById(dischargeId);
    }

    // @GetMapping("/patient/{samId}")
    // public List<DischargeDetailsModel> getDischargeBySamId(@PathVariable int samId){
    //     return (List<DischargeDetailsModel>) this.dischargeChildRepository.findBySamId(samId);
    // }

    @GetMapping("/discharge/{dischargeId}")
    public Optional<DischargeModel> getDischargeById(@PathVariable int dischargeId){
        return (Optional<DischargeModel>) this.dischargeChildRepository.getDischargeById(dischargeId);
    }

    // @GetMapping("/patient/{rchId}")
    // public Optional<Patient> getPatientById(@PathVariable String rchId) {
    //     System.out.println("RCH ID " + rchId);
    // 	return this.patientRepository.findByRchId(rchId);
    // }

    @GetMapping("/discharge-comorbid/{dischargeId}")
    public List<String> getComorbidById(@PathVariable int dischargeId){
        return (List<String>) this.dischargeChildRepository.getComorbidById(dischargeId);
    }

    @PostMapping("/discharge-child")
    public String getDischargeChild(@RequestBody String dischargeDetails) {
        return "Discharge Details:  " + dischargeDetails;
    }




}
