package com.phc.phc.controller;

import com.phc.phc.entity.FollowupsSchedule;
import com.phc.phc.repository.FollowupScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class FollowupScheduleController {

    private final FollowupScheduleRepository followupScheduleRepository;

    @Autowired
    public  FollowupScheduleController(FollowupScheduleRepository followupScheduleRepository){
        this.followupScheduleRepository = followupScheduleRepository;
    }

    @GetMapping("/followups")
    public List<FollowupsSchedule> getFollowupSchedule(){return (List<FollowupsSchedule>) this.followupScheduleRepository.findAll();}

    @PostMapping("/add_followup")
    public void addFollowup(@RequestBody FollowupsSchedule followupsSchedule){
        this.followupScheduleRepository.save(followupsSchedule);
    }
}
