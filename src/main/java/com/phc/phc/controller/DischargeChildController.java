package com.phc.phc.controller;

import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import com.phc.phc.repository.AshaChildRepository;
import com.phc.phc.repository.DischargeChildRepository;
import com.phc.phc.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DischargeChildController {

    private final DischargeChildRepository dischargeChildRepository;
    private final AshaChildRepository ashaChildRepository;
    private final NotificationRepository notificationRepository;
    @Autowired
    public DischargeChildController(NotificationRepository notificationRepository, DischargeChildRepository dischargeChildRepository, AshaChildRepository ashaChildRepository){
        this.dischargeChildRepository = dischargeChildRepository;
        this.ashaChildRepository = ashaChildRepository;
        this.notificationRepository = notificationRepository;
    }

    @GetMapping("/patientss")
    public List<DischargeChildDetail> getDischargeChild(){
        return (List<DischargeChildDetail>) this.dischargeChildRepository.findAll();
    }

    @GetMapping("/patientssss")
    public List<DischargedPatientModel> getDischarge(){
        return (List<DischargedPatientModel>) this.dischargeChildRepository.getDischarge();
    }

    @GetMapping("/patients")
    public List<DischargedPatientModel> getDischarge1(){
        List<DischargedPatientModel> a = new ArrayList<DischargedPatientModel>();
        List<DischargedPatientModel> b = this.dischargeChildRepository.getDischarge();
        List<Integer> assigned = this.ashaChildRepository.getAssignedChildren();
        List<Integer> approved = this.notificationRepository.getApproved();

//        for(int i=0;i<assigned.size();i++){
//            System.out.println(assigned.get(i));
//            System.out.println(assigned.contains(1));
//            System.out.println(assigned.contains(2));
//            System.out.println(assigned.contains(5));
//        }

        for(int i=0;i<b.size();i++){
//            System.out.println("VALUE" + b.get(i).getCaseId());

            if(assigned.contains((b.get(i).getCaseId()))){
//                System.out.println("HELLO HII");
            }
//            System.out.println(b.get(i).getSamId());
//            System.out.println(b.get(i));
            else if (approved.contains(b.get(i).getCaseId())){a.add(b.get(i));}
        }
        return a;
//        return (List<DischargedPatientModel>) this.dischargeChildRepository.getDischarge();
    }

    @GetMapping("/patients/{phcId}")
    public List<DischargedPatientModel> getDischargePhc(@PathVariable int phcId){
        List<DischargedPatientModel> a = new ArrayList<DischargedPatientModel>();
        List<DischargedPatientModel> b = this.dischargeChildRepository.getDischarge();
        List<Integer> assigned = this.ashaChildRepository.getAssignedChildren();
        List<Integer> approved = this.notificationRepository.getApproved();
        List<Integer> phc = this.notificationRepository.getPhc(phcId);

//        for(int i=0;i<assigned.size();i++){
//            System.out.println(assigned.get(i));
//            System.out.println(assigned.contains(1));
//            System.out.println(assigned.contains(2));
//            System.out.println(assigned.contains(5));
//        }

        for(int i=0;i<b.size();i++){
//            System.out.println("VALUE" + b.get(i).getCaseId());

            if(assigned.contains((b.get(i).getCaseId()))){
//                System.out.println("HELLO HII");
            }
//            System.out.println(b.get(i).getSamId());
//            System.out.println(b.get(i));
            else if (approved.contains(b.get(i).getCaseId()) && phc.contains(b.get(i).getCaseId())){a.add(b.get(i));}
        }
        return a;
//        return (List<DischargedPatientModel>) this.dischargeChildRepository.getDischarge();
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

    @GetMapping("/discharged/{caseId}")
    public DischargeModel getDischargeByCaseId(@PathVariable int caseId){
        return (DischargeModel) this.dischargeChildRepository.getDischargeByCaseId(caseId);
    }

    // @GetMapping("/patient/{rchId}")
    // public Optional<Patient> getPatientById(@PathVariable String rchId) {
    //     System.out.println("RCH ID " + rchId);
    // 	return this.patientRepository.findByRchId(rchId);
    // }

    @GetMapping("/discharge-comorbid/{caseId}")
    public List<String> getComorbidById(@PathVariable int caseId){
        return (List<String>) this.dischargeChildRepository.getComorbidById(caseId);
    }

    @PostMapping("/discharge-child")
    public String getDischargeChild(@RequestBody String dischargeDetails) {
        return "Discharge Details:  " + dischargeDetails;
    }




}
