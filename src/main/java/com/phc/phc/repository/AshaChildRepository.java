package com.phc.phc.repository;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.CaseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AshaChildRepository extends JpaRepository<AshaChildMapping, String> {

    @Query(value = "Select u.caseId from AshaChildMapping u")
    List<Integer> getAssignedChildren();


}
