package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.NrcDoctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//import javax.print.Doc;

public interface NrcDoctorsRepository extends JpaRepository<NrcDoctors, Integer> {

    @Override
    @Query("Select u from NrcDoctors u where u.status='ACTIVE'")
    List<NrcDoctors> findAll();
    NrcDoctors findByUsername(String username);
}
