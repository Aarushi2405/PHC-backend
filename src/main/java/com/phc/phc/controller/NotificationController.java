package com.phc.phc.controller;

import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.entity.Notification;
import com.phc.phc.model.NotificationModel;
import com.phc.phc.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NotificationController {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationController(NotificationRepository notificationRepository){
        this.notificationRepository = notificationRepository;
    }

    @GetMapping("/discharged-patients")
    public List<Notification> getDischargedPatients(){
        return (List<Notification>) this.notificationRepository.findAll();
    }

    @GetMapping("/discharged-patient")
    public List<NotificationModel> getDischargedPatient(){
        return (List<NotificationModel>) this.notificationRepository.getNotification();
    }

    @PostMapping("/discharge-approve")
    public void approveDischarge(@RequestBody int caseId){
        System.out.println("update:" +caseId);
//        this.notificationRepository.approve(caseId);
        Notification n = this.notificationRepository.findByCaseId(caseId);
        n.setAcceptStatus("YES");
        this.notificationRepository.save(n);
//        System.out.println(n.getCaseId());
    }
}