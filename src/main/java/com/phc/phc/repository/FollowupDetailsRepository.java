package com.phc.phc.repository;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FollowupDetailsRepository extends JpaRepository<FollowupDetails, Integer> {

//    @Query("SELECT u from FollowupDetails u order by u.followupId FETCH FIRST 1 ROWS ONLY")
Optional<FollowupDetails> findTopByOrderByFollowupIdDesc();

@Query(value="Select u from FollowupDetails u where u.followupId=?1")
    FollowupDetails getFollowupById(int followupId);
}
