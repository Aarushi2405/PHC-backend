package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//import javax.print.Doc;

public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {

    @Override
    @Query("Select u from Doctors u where u.status='ACTIVE'")
    List<Doctors> findAll();
    Doctors findByUsername(String username);
}
