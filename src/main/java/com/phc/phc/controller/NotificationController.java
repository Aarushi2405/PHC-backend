package com.phc.phc.controller;

import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.entity.Notification;
import com.phc.phc.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
