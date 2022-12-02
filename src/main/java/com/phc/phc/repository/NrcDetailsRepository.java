package com.phc.phc.repository;

import com.phc.phc.entity.Notification;
import com.phc.phc.entity.NrcDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NrcDetailsRepository extends JpaRepository<NrcDetails, Integer> {
}
