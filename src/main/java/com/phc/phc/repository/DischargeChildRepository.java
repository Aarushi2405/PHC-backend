package com.phc.phc.repository;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.DischargeChildModel;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface DischargeChildRepository extends JpaRepository<DischargeChildDetail, Long>{
//    @Query("SELECT u.dischargeId, u.avgWeightGainKg FROM DischargeChildDetail u")
//    List<String> getDischarge();

    @Query("SELECT u.caseDetail.childDemography.rchId as rchId, u.caseDetail.childDemography.name as name, u.createdOn as dischargeDate, u.dischargeId as dischargeId FROM DischargeChildDetail u")
    List<DischargedPatientModel> getDischarge();

    @Query("SELECT u.caseDetail.samNum as samId, u.caseDetail.childDemography.name as name FROM DischargeChildDetail u where u.dischargeId = ?1")
    List<DischargeDetailsModel> findByDischargeId(int dischargeId);

    @Query("SELECT a.heightCm as heightCm, a.weightKg as weightKg, u.avgWeightGainKg as avgWeightGainKg, u.clinicalImpression as clinicalImpression, u.dietaryAdvice as dietaryAdvice, u.medicalAdvice as medicalAdvice, o.outcome as outcome, u.treatmentGiven as treatmentGiven FROM DischargeChildDetail u, Outcome o, ChildGrowth a where o.outcomeId=u.outcomeId and a.caseDetail.caseId=u.caseDetail.caseId and a.recordedAtDischarge=1 and u.dischargeId = ?1")
    List<DischargeModel> getDischargeById(int dischargeId);

    @Query("SELECT c.comorbidCondition as comorbidCondition  from ComorbidConditionValue c, DischargeComorbidCondition d, DischargeChildDetail u where u.caseDetail.caseId=d.caseDetail.caseId and d.comorbidId=c.comorbidId and u.dischargeId = ?1")
    List<String> getComorbidById(int dischargeId);


}


