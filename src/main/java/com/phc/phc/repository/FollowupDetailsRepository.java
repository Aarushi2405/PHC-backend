package com.phc.phc.repository;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupDetails;
import com.phc.phc.model.AshaFollowupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FollowupDetailsRepository extends JpaRepository<FollowupDetails, Integer> {

//    @Query("SELECT u from FollowupDetails u order by u.followupId FETCH FIRST 1 ROWS ONLY")
Optional<FollowupDetails> findTopByOrderByFollowupIdDesc();

@Query(value="Select u from FollowupDetails u where u.followupId=?1")
    FollowupDetails getFollowupById(int followupId);

    @Query(value="Select s.followupDetails.followupId as followupId, s.followupDate as followupDate, s.scheduleId as scheduleId, u.height as height, u.weight as weight, u.headCircumference as headCircumference, u.muac as muac, u.sdRange as sdRange from FollowupsSchedule s left outer join s.followupDetails u where s.caseDetail.caseId = ?1 and s.type='COMMUNITY'")
    List<AshaFollowupModel> getFollowups(int caseId);
}
