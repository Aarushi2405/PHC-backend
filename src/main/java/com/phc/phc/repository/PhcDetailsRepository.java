package com.phc.phc.repository;

import com.phc.phc.entity.Notification;
import com.phc.phc.entity.PhcDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhcDetailsRepository extends JpaRepository<PhcDetails, Integer> {
}
