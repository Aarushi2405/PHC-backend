package com.phc.phc.controller;

import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.entity.FollowupsSchedule;
import com.phc.phc.model.*;
import com.phc.phc.repository.ChildDetailRepository;
import com.phc.phc.repository.FollowupDetailsRepository;
import com.phc.phc.repository.FollowupScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class FollowupScheduleController {

    private final FollowupScheduleRepository followupScheduleRepository;
    private final FollowupDetailsRepository followupDetailsRepository;
    private final ChildDetailRepository childDetailRepository;
//    private final
    @Autowired
    public  FollowupScheduleController(FollowupScheduleRepository followupScheduleRepository, FollowupDetailsRepository followupDetailsRepository, ChildDetailRepository childDetailRepository){
        this.followupScheduleRepository = followupScheduleRepository;
        this.followupDetailsRepository = followupDetailsRepository;
        this.childDetailRepository = childDetailRepository;
    }

    @GetMapping("/followups")
    public List<FollowupsSchedule> getFollowupSchedule(){return (List<FollowupsSchedule>) this.followupScheduleRepository.findAll();}

//    @PostMapping("/add_followup")
//    public void addFollowup(@RequestBody FollowupsSchedule followupsSchedule){
//        this.followupScheduleRepository.save(followupsSchedule);
//    }

    @GetMapping("/followups-schedule")
    public List<FollowupScheduleModel> getFollowupScheduless(){
//        System.out.println();
        return (List<FollowupScheduleModel>)this.followupScheduleRepository.getFollowupSchedules();
    }

    @GetMapping("/followups-schedule/{caseId}")
    public List<FollowupScheduleModel> getFollowupScheduleById(@PathVariable int caseId){
        return (List<FollowupScheduleModel>)this.followupScheduleRepository.getFollowupScheduleById(caseId);
    }

    @GetMapping("/followup-dates/{caseId}")
    public List<FollowupDatesModel> getFollowupDates(@PathVariable int caseId){
         return (List<FollowupDatesModel> )this.followupScheduleRepository.getFollowupDates(caseId);

//        List<FollowupDates> followups = new ArrayList<FollowupDates>();

    }

    @GetMapping("/asha-followups-details/{caseId}")
    public List<FollowupsSchedule> getFollowupById(@PathVariable int caseId){
        return (List<FollowupsSchedule>)this.followupScheduleRepository.getFollowupByCaseId(caseId);
    }
    @GetMapping("/followup-schedule")
    public List<FollowupsModel> getFollowupSchedules(){
        List<FollowupScheduleModel> a = this.followupScheduleRepository.getFollowupSchedules();
        System.out.println(a);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Map<Long, FollowupsModel> child = new HashMap<Long, FollowupsModel>();
        for(int i=0;i<a.size();i++){
            Long sam = a.get(i).getSamNum();
            if(!child.containsKey(sam)){
            FollowupsModel f = new FollowupsModel(sam, a.get(i).getRchId(), a.get(i).getCaseId(), a.get(i).getFollowupId(), a.get(i).getScheduleId(), a.get(i).getChildName(),a.get(i).getMobileNumber(), a.get(i).getAshaName(), a.get(i).getAshaId(), a.get(i).getAshaNumber(), 0L,new Date(0L),new Date(0L),new Date(0L), new Date(0L) );
            child.put(sam,f);}
//            System.out.println(DateFormat.format(a.get(i).getFollowupDate()));
//            System.out.println(a.get(i).getType());
//            System.out.println(a.get(i).getSamNum());
//            System.out.println(a.get(i).getStatus());
            if(a.get(i).getStatus().equals("DONE")){

                child.get(sam).setFollowupsDone(child.get(sam).getFollowupsDone()+1);
                if(a.get(i).getType().equals("COMMUNITY")){
                    child.get(sam).setLastCommunity(a.get(i).getFollowupDate());
                }
                else{
                    child.get(sam).setLastNrc(a.get(i).getFollowupDate());
                }
            }
            else{
                if(a.get(i).getType().equals("COMMUNITY")){
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextCommunity())){
                        child.get(sam).setNextCommunity(a.get(i).getFollowupDate());
                    }
                }
                else{
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextNrc())){
                        child.get(sam).setNextNrc(a.get(i).getFollowupDate());
                    }
                }
            }

        }

        ArrayList<FollowupsModel> followups = new ArrayList<FollowupsModel>(child.values());

//        FollowupScheduleModel f = (FollowupScheduleModel) a.get(0);
//        System.out.println(f);
        return (List<FollowupsModel>) followups  ;
    }

    @GetMapping("/followup-schedule/{phcId}")
    public List<FollowupsModel> getFollowupSchedulesPhc(@PathVariable int phcId){
        List<FollowupScheduleModel> a = this.followupScheduleRepository.getFollowupSchedulesPhc(phcId);
        System.out.println(a);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Map<Long, FollowupsModel> child = new HashMap<Long, FollowupsModel>();
        for(int i=0;i<a.size();i++){
            Long sam = a.get(i).getSamNum();
            if(!child.containsKey(sam)){
                FollowupsModel f = new FollowupsModel(sam, a.get(i).getRchId(), a.get(i).getCaseId(), a.get(i).getFollowupId(), a.get(i).getScheduleId(), a.get(i).getChildName(),a.get(i).getMobileNumber(), a.get(i).getAshaName(), a.get(i).getAshaId(), a.get(i).getAshaNumber(), 0L,new Date(0L),new Date(0L), new Date(0L), new Date(0L) );
                child.put(sam,f);}
//            System.out.println(DateFormat.format(a.get(i).getFollowupDate()));
//            System.out.println(a.get(i).getType());
//            System.out.println(a.get(i).getSamNum());
//            System.out.println(a.get(i).getStatus());
            if(a.get(i).getStatus().equals("DONE")){

                child.get(sam).setFollowupsDone(child.get(sam).getFollowupsDone()+1);
                if(a.get(i).getType().equals("COMMUNITY")){
                    child.get(sam).setLastCommunity(a.get(i).getFollowupDate());
                }
                else{
                    child.get(sam).setLastNrc(a.get(i).getFollowupDate());
                }
            }
            else{
                if(a.get(i).getType().equals("COMMUNITY")){
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextCommunity())){
                        child.get(sam).setNextCommunity(a.get(i).getFollowupDate());
                    }
                }
                else{
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextNrc())){
                        child.get(sam).setNextNrc(a.get(i).getFollowupDate());
                    }
                }
            }

        }

        ArrayList<FollowupsModel> followups = new ArrayList<FollowupsModel>(child.values());

//        FollowupScheduleModel f = (FollowupScheduleModel) a.get(0);
//        System.out.println(f);
        return (List<FollowupsModel>) followups  ;
    }


    @GetMapping("/asha-followup-schedule/{ashaId}")
    public List<FollowupsModel> getFollowupSchedulesAsha(@PathVariable int ashaId){
        List<FollowupScheduleModel> a = this.followupScheduleRepository.getFollowupSchedulesAsha(ashaId);
        System.out.println(a);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Map<Long, FollowupsModel> child = new HashMap<Long, FollowupsModel>();
        for(int i=0;i<a.size();i++){
            Long sam = a.get(i).getSamNum();
            if(!child.containsKey(sam)){
                FollowupsModel f = new FollowupsModel(sam, a.get(i).getRchId(), a.get(i).getCaseId(), a.get(i).getFollowupId(), a.get(i).getScheduleId(), a.get(i).getChildName(),a.get(i).getMobileNumber(), a.get(i).getAshaName(), a.get(i).getAshaId(), a.get(i).getAshaNumber(), 0L,new Date(0L),new Date(0L), new Date(0L), new Date(0L) );
                child.put(sam,f);}
//            System.out.println(DateFormat.format(a.get(i).getFollowupDate()));
//            System.out.println(a.get(i).getType());
//            System.out.println(a.get(i).getSamNum());
//            System.out.println(a.get(i).getStatus());
            if(a.get(i).getStatus().equals("DONE")){

                child.get(sam).setFollowupsDone(child.get(sam).getFollowupsDone()+1);
                if(a.get(i).getType().equals("COMMUNITY")){
                    child.get(sam).setLastCommunity(a.get(i).getFollowupDate());
                }
                else{
                    child.get(sam).setLastNrc(a.get(i).getFollowupDate());
                }

            }
            else{
                if(a.get(i).getType().equals("COMMUNITY")){
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextCommunity())){
                        child.get(sam).setNextCommunity(a.get(i).getFollowupDate());
                    }
                }
                else{
                    if(a.get(i).getFollowupDate().after(child.get(sam).getNextNrc())){
                        child.get(sam).setNextNrc(a.get(i).getFollowupDate());
                    }
                }
            }

        }

        ArrayList<FollowupsModel> followups = new ArrayList<FollowupsModel>(child.values());

//        FollowupScheduleModel f = (FollowupScheduleModel) a.get(0);
//        System.out.println(f);
        return (List<FollowupsModel>) followups  ;
    }

    @PostMapping("/followup-schedule")
    void addFollowup(@RequestBody FollowupsModel followupsSchedule){
//        FollowupDetails followupDetails1= new FollowupDetails();
//        int id = followupDetails1.getFollowupId();
//        followupDetails1 = followupDetails;
//        followupDetails.setFollowupId(20);
//        System.out.println("SAVE FOLLOWUP"+ followupsSchedule.getFollowupDate());
//        System.out.println("FOLLOWUP id"+followupDetails.getFollowupId());
//        System.out.println("FOLLOWUP iddd"+id);
//        System.out.println("FOLLOWUP "+followupDetails);
//        followupDetailsRepository.save(followupDetails);
        FollowupsSchedule s = new FollowupsSchedule();
        System.out.println("CASEEEE iddd"+followupsSchedule.getCaseId());
        System.out.println("FOLLOWUP iddd"+followupsSchedule.getFollowupId());
//        Time
        s.setFollowupDate(new Timestamp(System.currentTimeMillis()));
        s.setType("GENERAL");
        s.setStatus("DONE");
        s.setCaseDetail(this.childDetailRepository.getById(Math.toIntExact(followupsSchedule.getCaseId())));
        s.setFollowupDetails(this.followupDetailsRepository.getFollowupById(Math.toIntExact(followupsSchedule.getFollowupId())));
        followupScheduleRepository.save(s);
//        followupDetailsRepository.
    }


    @PostMapping("/followup-update")
    public void updateFollowup(@RequestBody int data){

        Optional<FollowupsSchedule> f = followupScheduleRepository.findById(data);
        FollowupsSchedule x = f.get();
        Optional<FollowupDetails> k = this.followupDetailsRepository.findTopByOrderByFollowupIdDesc();
        x.setFollowupDetails(k.get());
        x.setStatus("DONE");
        this.followupScheduleRepository.save(x);
    }

    @PostMapping("/followup-cancel")
    public void cancelFollowup(@RequestBody int data){

        Optional<FollowupsSchedule> f = followupScheduleRepository.findById(data);
        FollowupsSchedule x = f.get();
        Optional<FollowupDetails> k = this.followupDetailsRepository.findTopByOrderByFollowupIdDesc();
        x.setFollowupDetails(k.get());
        System.out.println("FOLLOWUP "+x);
        x.setStatus("CANCELLED");
        this.followupScheduleRepository.save(x);
    }

}
