package com.phc.phc.controller;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupsSchedule;
import com.phc.phc.model.AshaChildModel;
import com.phc.phc.repository.AshaChildRepository;
import com.phc.phc.repository.AshaWorkerRepository;
import com.phc.phc.repository.ChildDetailRepository;
import com.phc.phc.repository.FollowupScheduleRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AshaChildController {

    private final AshaChildRepository ashaChildRepository;
    private final AshaWorkerRepository ashaWorkerRepository;
    private final ChildDetailRepository childDetailRepository;
    private final FollowupScheduleRepository followupScheduleRepository;

    public AshaChildController(FollowupScheduleRepository followupScheduleRepository, AshaChildRepository ashaChildRepository, AshaWorkerRepository ashaWorkerRepository, ChildDetailRepository childDetailRepository){
        this.ashaChildRepository = ashaChildRepository;
        this.ashaWorkerRepository = ashaWorkerRepository;
        this.childDetailRepository = childDetailRepository;
        this.followupScheduleRepository = followupScheduleRepository;
    }

    @GetMapping("/Asha-child")
    public List<AshaChildMapping> getAshaChildMapping(){
        return (List<AshaChildMapping>) this.ashaChildRepository.findAll();
    }

    @GetMapping("/assigned-children")
    public List<Integer> getAssigned(){
        return (List<Integer>) this.ashaChildRepository.getAssignedChildren();
    }


    @PostMapping("/Asha-child")
    public void addAshaChildMapping(@RequestBody AshaChildModel ashaChildMapping){
        System.out.println("SAVE ASHA CHILD");
//        System.out.println(ashaChildMapping.getCaseId());
        System.out.println(ashaChildMapping);
        System.out.println(ashaChildMapping.getAshaId());
        int ashaId = ashaChildMapping.getAshaId();
        AshaChildMapping a = new AshaChildMapping();

        a.setAshaWorker(this.ashaWorkerRepository.getAshaById(ashaId));
        a.setCaseId(ashaChildMapping.getCaseId());

        FollowupsSchedule followup = new FollowupsSchedule();


        CaseDetail c =  this.childDetailRepository.getById(ashaChildMapping.getCaseId());
        Timestamp d = c.getDischargeDate();
        followup.setCaseDetail(c);
        followup.setStatus("NOT DONE");
        followup.setType("NRC");
        Calendar cal = Calendar.getInstance();




        int dates[] = {7,22,37, 67, 97};
        for(int i=0;i<dates.length;i++){
            followup = new FollowupsSchedule();
            followup.setCaseDetail(c);
            followup.setStatus("NOT DONE");
            followup.setType("NRC");
            cal.setTime(d);
            cal.add(Calendar.DATE,dates[i]);
            followup.setFollowupDate(new Timestamp(cal.getTime().getTime()));
            System.out.println(new Timestamp(cal.getTime().getTime()));
//            this..save(followup);
            this.followupScheduleRepository.save(followup);
        }
        int comdates[] = {7, 14, 21, 28, 43, 58, 73, 88, 103, 118};

        for(int i=0;i<comdates.length;i++){
            followup = new FollowupsSchedule();
            followup.setCaseDetail(c);
            followup.setStatus("NOT DONE");
            followup.setType("COMMUNITY");
            cal.setTime(d);
            cal.add(Calendar.DATE,comdates[i]);
            followup.setFollowupDate(new Timestamp(cal.getTime().getTime()));
            System.out.println(new Timestamp(cal.getTime().getTime()));
//            this..save(followup);
            this.followupScheduleRepository.save(followup);
        }
//        f1.setStatus();
//        f1.setCaseDetail();
        this.ashaChildRepository.save(a);
    }
}
