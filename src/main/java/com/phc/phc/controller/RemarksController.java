package com.phc.phc.controller;
import com.phc.phc.entity.ComorbidConditionValue;
import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.entity.Remarks;
import com.phc.phc.model.ChildDetailsModel;
import com.phc.phc.repository.ComorbiditiesRepository;
import com.phc.phc.repository.RemarksRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RemarksController {

    private final RemarksRepository remarksRepository;

    public RemarksController(RemarksRepository remarksRepository){
        this.remarksRepository = remarksRepository;
    }

    @GetMapping("/remarks")
    public List<Remarks> getRemarks(){
        return (List<Remarks>) this.remarksRepository.findAll();
    }

    @GetMapping("/remarks/{caseId}")
    public List<Remarks> getRemarks(@PathVariable int caseId){
        return (List<Remarks>) this.remarksRepository.getRemarks(caseId);
    }

    @PostMapping("/remarks")
    void addRemark(@RequestBody Remarks remark){

        this.remarksRepository.save(remark);
    }


}
