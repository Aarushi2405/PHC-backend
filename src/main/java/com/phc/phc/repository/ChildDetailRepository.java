package com.phc.phc.repository;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.entity.WflRefFromNrc;
import com.phc.phc.model.ChildDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildDetailRepository extends JpaRepository<CaseDetail, Integer> {

//    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.caseId=?1")
//    List<ChildDetailsModel> getDetails(int caseId);
//

    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.admissionDate as admissionDate, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.caseId=?1")
    ChildDetailsModel getDetails(int caseId);

    @Query("SELECT u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.dischargeDate as dischargeDate, u.dischargeSd as dischargeSd, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber, u.childDemography.name as name, u.childDemography.gender as gender, u.childDemography.ageInMonths as ageInMonths from CaseDetail u where u.samNum=?1")
    List<ChildDetailsModel> getDetailsFromSamId(int samId);

    @Query("SELECT u from CaseDetail u where u.caseId=?1")
    CaseDetail getById(int caseId);

    @Query("SELECT u.childDemography.name as name, u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.admissionDate as admissionDate, u.dischargeDate as dischargeDate, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber from CaseDetail u, Notification n where u.caseId=n.caseId and n.acceptStatus='YES'")
    List<ChildDetailsModel> getChild();

    @Query("SELECT u.childDemography.name as name, u.caseId as caseId, u.samNum as samNum, u.childDemography.addressLine1 as address, u.childDemography.rchId as rch, u.admissionDate as admissionDate, u.dischargeDate as dischargeDate, u.childDemography.pincode as pincode, u.childDemography.mobileNumber as mobileNumber from CaseDetail u, Notification n where u.caseId=n.caseId and n.acceptStatus='YES' and phc=?1")
    List<ChildDetailsModel> getChildPhc(int phcId);

    @Query("SELECT u from WflRefFromNrc u, CaseDetail c, FollowupsSchedule f where c.childDemography.gender = u.gender and c.caseId=f.caseDetail.caseId and f.scheduleId=?1")
    List<WflRefFromNrc> getSdRange(int caseId);
}
