package com.phc.phc.repository;

import com.phc.phc.entity.ComorbidConditionValue;
import com.phc.phc.entity.Remarks;
import com.phc.phc.model.ChildDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RemarksRepository extends JpaRepository<Remarks, Integer> {

    @Query("SELECT u from Remarks u where u.caseId=?1")
    List<Remarks> getRemarks(int caseId);
}
