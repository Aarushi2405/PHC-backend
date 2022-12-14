package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.Notification;
import com.phc.phc.entity.PhcDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhcDetailsRepository extends JpaRepository<PhcDetails, Integer> {

    @Override
    @Query("Select u from PhcDetails u where u.status='ACTIVE'")
    List<PhcDetails> findAll();
}
