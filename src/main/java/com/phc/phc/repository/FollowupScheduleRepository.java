package com.phc.phc.repository;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupSchedule;
import com.phc.phc.entity.FollowupsSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowupScheduleRepository extends JpaRepository<FollowupsSchedule, Integer> {
}
