package com.phc.phc.repository;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

//import javax.print.Doc;

public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {
    Doctors findByUsername(String username);
}
