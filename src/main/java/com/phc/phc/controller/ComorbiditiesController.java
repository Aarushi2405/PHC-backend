package com.phc.phc.controller;
import com.phc.phc.entity.Asha;
import com.phc.phc.entity.ComorbidConditionValue;
import com.phc.phc.repository.AshaRepository;
import com.phc.phc.repository.ComorbiditiesRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ComorbiditiesController {

    private final ComorbiditiesRepository comorbiditiesRepository;

    public ComorbiditiesController(ComorbiditiesRepository comorbiditiesRepository){
        this.comorbiditiesRepository = comorbiditiesRepository;
    }

    @GetMapping("/comorbidities")
    public List<ComorbidConditionValue> getComorbidities(){
        return (List<ComorbidConditionValue>) this.comorbiditiesRepository.findAll();
    }


}
