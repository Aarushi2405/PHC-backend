package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.Notification;
import com.phc.phc.entity.NrcDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NrcDetailsRepository extends JpaRepository<NrcDetails, Integer> {

    @Override
    @Query("Select u from NrcDetails u where u.status='ACTIVE'")
    List<NrcDetails> findAll();

}
