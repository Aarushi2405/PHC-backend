package com.phc.phc.controller;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.NrcDetails;
import com.phc.phc.repository.NrcDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NrcDetailsController {

    private final NrcDetailsRepository nrcDetailsRepository;

    @Autowired
    public NrcDetailsController(NrcDetailsRepository nrcDetailsRepository){
        this.nrcDetailsRepository = nrcDetailsRepository;
    }

    @GetMapping("/nrc-details")
    public List<NrcDetails> getNrcDetails(){
        return (List<NrcDetails>) this.nrcDetailsRepository.findAll();
    }

    @PutMapping("/nrc-details")
    private NrcDetails updateNrcDetails(@RequestBody NrcDetails nrc){
        this.nrcDetailsRepository.save(nrc);
        return nrc;
    }

    @DeleteMapping("/nrc-details/{nrcId}")
    private void deleteNrcDetails(@PathVariable("nrcId") int nrcId ){
        this.nrcDetailsRepository.deleteById(nrcId);
    }

    @PostMapping("/nrc-details")
    void addNrcDetails(@RequestBody NrcDetails nrc){

        nrc.setStatus("ACTIVE");
        this.nrcDetailsRepository.save(nrc);
    }

    @PostMapping("/nrc-deactivate")
    void deactivate(@RequestBody int nrcId){
        NrcDetails nrc = this.nrcDetailsRepository.getReferenceById(nrcId);
        nrc.setStatus("INACTIVE");
        this.nrcDetailsRepository.save(nrc);
    }

}
