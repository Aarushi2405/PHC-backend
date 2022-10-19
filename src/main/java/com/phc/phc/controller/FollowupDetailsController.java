package com.phc.phc.controller;

import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.entity.FollowupsSchedule;
import com.phc.phc.repository.FollowupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class FollowupDetailsController {

    private final FollowupDetailsRepository followupDetailsRepository;

    @Autowired
    public FollowupDetailsController(FollowupDetailsRepository followupDetailsRepository){
        this.followupDetailsRepository = followupDetailsRepository;
    }

    @GetMapping("/followup/{followupId}")
    public Optional<FollowupDetails> getFollowupDetailsById(@PathVariable int followupId ){
        return (Optional<FollowupDetails>) this.followupDetailsRepository.findById(followupId);
    }

    @PostMapping("/followup")
    void addFollowup(@RequestBody FollowupDetails followupDetails){
//        FollowupDetails followupDetails1= new FollowupDetails();
//        int id = followupDetails1.getFollowupId();
//        followupDetails1 = followupDetails;
//        followupDetails.setFollowupId(20);
//        System.out.println(caseId);
        System.out.println("FOLLOWUP id"+followupDetails.getFollowupId());
//        System.out.println("FOLLOWUP iddd"+id);
        System.out.println("FOLLOWUP "+followupDetails);
        followupDetailsRepository.save(followupDetails);

//        followupDetailsRepository.
    }

    @GetMapping("/followup/last")
    public Optional<FollowupDetails> getFollowupLast( ){
        return (Optional<FollowupDetails>) this.followupDetailsRepository.findTopByOrderByFollowupIdDesc();
    }



}
