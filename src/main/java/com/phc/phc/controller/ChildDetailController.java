package com.phc.phc.controller;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.ChildDetailsModel;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import com.phc.phc.repository.ChildDetailRepository;
import com.phc.phc.repository.DischargeChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChildDetailController {


    private final ChildDetailRepository childDetailRepository;

    @Autowired
    public ChildDetailController(ChildDetailRepository childDetailRepository){
        this.childDetailRepository=childDetailRepository;
    }

    @GetMapping("/childs")
    public List<CaseDetail> getCaseDetail(){return (List<CaseDetail>) this.childDetailRepository.findAll();}

    @GetMapping("/child/{caseId}")
    public List<ChildDetailsModel> getCaseDetails(@PathVariable int caseId){return (List<ChildDetailsModel>) this.childDetailRepository.getDetails(caseId);}

    @GetMapping("/child-details/{samId}")
    public Optional<ChildDetailsModel> getCaseDetailsFromSamId(@PathVariable int samId){return (Optional<ChildDetailsModel>) this.childDetailRepository.getDetailsFromSamId(samId);}



}
