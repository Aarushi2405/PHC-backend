package com.phc.phc.repository;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.NrcDoctors;
import org.springframework.data.jpa.repository.JpaRepository;

//import javax.print.Doc;

public interface NrcDoctorsRepository extends JpaRepository<NrcDoctors, Integer> {
    NrcDoctors findByUsername(String username);
}
