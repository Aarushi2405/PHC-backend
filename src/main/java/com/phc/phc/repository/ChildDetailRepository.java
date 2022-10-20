package com.phc.phc.repository;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.ChildDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildDetailRepository extends JpaRepository<CaseDetail, Long> {

//    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.caseId=?1")
//    List<ChildDetailsModel> getDetails(int caseId);
//

    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.caseId=?1")
    List<ChildDetailsModel> getDetails(int caseId);

    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.samNum=?1")
    Optional<ChildDetailsModel> getDetailsFromSamId(int samId);
}
