package com.phc.phc.controller;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.repository.AshaChildRepository;
import com.phc.phc.repository.AshaWorkerRepository;
import com.phc.phc.repository.DischargeChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AshaWorkerController {

    private final AshaWorkerRepository ashaWorkerRepository;
    @Autowired
    public AshaWorkerController(AshaWorkerRepository ashaWorkerRepository){
        this.ashaWorkerRepository = ashaWorkerRepository;
           }

    @GetMapping("/asha-worker")
    public List<AshaWorker> getAshaWorker(){
        System.out.println("HERE");
        return (List<AshaWorker>) this.ashaWorkerRepository.findAll();
    }

//    @RequestMapping("/asha-worker-search")
//    public @ResponseBody List<AshaWorker> getAshaWorkerFromLocation(@RequestParam String ward, @RequestParam String area, @RequestParam String pincode) {
////        return (List<AshaWorker>) this.ashaWorkerRepository.findByWardOrAreaOrPincode(ward, area, pincode);
//    }


}
