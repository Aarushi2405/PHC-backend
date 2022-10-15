package com.phc.phc.repository;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowupDetailsRepository extends JpaRepository<FollowupDetails, Long> {
}
