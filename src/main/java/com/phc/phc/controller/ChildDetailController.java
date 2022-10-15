package com.phc.phc.controller;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.model.ChildDetailsModel;
import com.phc.phc.repository.ChildDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
