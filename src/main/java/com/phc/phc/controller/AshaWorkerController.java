package com.phc.phc.controller;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.entity.NrcDetails;
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

    @GetMapping("/asha-worker/{ashaId}")
    public AshaWorker getAshaById(@PathVariable int ashaId) {return (AshaWorker)this.ashaWorkerRepository.getAshaById(ashaId);
    }



    @RequestMapping("/asha-worker-search")
    public @ResponseBody List<AshaWorker> getAshaWorkerFromLocation(@RequestParam String ward, @RequestParam String area, @RequestParam String pincode) {
        return (List<AshaWorker>) this.ashaWorkerRepository.findByWardOrAreaOrPincode(ward, area, pincode);
    }

    @PutMapping("/asha-worker")
    private AshaWorker update(@RequestBody AshaWorker asha){
        this.ashaWorkerRepository.save(asha);
        return asha;
    }

    @DeleteMapping("/asha-worker/{ashaId}")
    private void deleteAsha(@PathVariable("ashaId") int ashaId ){
        this.ashaWorkerRepository.deleteById(ashaId);
    }

    @PostMapping("/asha-worker")
    void addAsha(@RequestBody AshaWorker asha){

        asha.setStatus("ACTIVE");
        this.ashaWorkerRepository.save(asha);
    }

    @PostMapping("/asha-deactivate")
    void deactivate(@RequestBody int ashaId){
        AshaWorker asha = this.ashaWorkerRepository.getReferenceById(ashaId);
        asha.setStatus("INACTIVE");
        this.ashaWorkerRepository.save(asha);
    }


}
