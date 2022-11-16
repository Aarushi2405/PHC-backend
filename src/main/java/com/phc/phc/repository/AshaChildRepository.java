package com.phc.phc.repository;

import com.phc.phc.entity.AshaChildMapping;
import com.phc.phc.entity.CaseDetail;
import com.phc.phc.model.ChildDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AshaChildRepository extends JpaRepository<AshaChildMapping, String> {

    @Query(value = "Select u.caseId from AshaChildMapping u")
    List<Integer> getAssignedChildren();

    @Query(value = "Select u.caseId as caseId, c.samNum as samNum, c.childDemography.name as name,c.childDemography.rchId as rchId, c.childDemography.addressLine1 as address, c.childDemography.pincode as pincode, c.childDemography.mobileNumber as mobileNumber from AshaChildMapping u, CaseDetail c where c.caseId = u.caseId and u.ashaWorker.ashaId = ?1")
    List<ChildDetailsModel> getChildren(int ashaId);


}
