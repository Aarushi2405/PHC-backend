package com.phc.phc.controller;

import com.phc.phc.entity.NrcDetails;
import com.phc.phc.entity.PhcDetails;
import com.phc.phc.repository.NrcDetailsRepository;
import com.phc.phc.repository.PhcDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PhcDetailsController {

    private final PhcDetailsRepository phcDetailsRepository;

    @Autowired
    public PhcDetailsController(PhcDetailsRepository phcDetailsRepository){
        this.phcDetailsRepository = phcDetailsRepository;
    }

    @GetMapping("/phc-details")
    public List<PhcDetails> getPhcDetails(){
        return (List<PhcDetails>) this.phcDetailsRepository.findAll();
    }

    @PutMapping("/phc-details")
    private PhcDetails updatePhcDetails(@RequestBody PhcDetails phc){
        this.phcDetailsRepository.save(phc);
        return phc;
    }

    @DeleteMapping("/phc-details/{phcId}")
    private void deletePhcDetails(@PathVariable("phcId") int phcId ){
        this.phcDetailsRepository.deleteById(phcId);
    }

    @PostMapping("/phc-details")
    void addPhcDetails(@RequestBody PhcDetails phc){

        phc.setStatus("ACTIVE");
        this.phcDetailsRepository.save(phc);
    }

    @PostMapping("/phc-deactivate")
    void deactivate(@RequestBody int phcId){
        PhcDetails phc = this.phcDetailsRepository.getReferenceById(phcId);
        phc.setStatus("INACTIVE");
        this.phcDetailsRepository.save(phc);
    }

}
