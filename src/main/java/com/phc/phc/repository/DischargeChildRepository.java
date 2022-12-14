package com.phc.phc.repository;
import com.phc.phc.entity.DischargeChildDetail;
import com.phc.phc.model.DischargeDetailsModel;
import com.phc.phc.model.DischargeModel;
import com.phc.phc.model.DischargedPatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DischargeChildRepository extends JpaRepository<DischargeChildDetail, Long>{
//    @Query("SELECT u.dischargeId, u.avgWeightGainKg FROM DischargeChildDetail u")
//    List<String> getDischarge();

    @Query("SELECT u.caseDetail.childDemography.rchId as rchId, u.caseDetail.samNum as samId, u.caseDetail.childDemography.name as name, u.createdOn as dischargeDate, u.dischargeId as dischargeId, u.caseDetail.caseId as caseId FROM DischargeChildDetail u")
    List<DischargedPatientModel> getDischarge();

    @Query("SELECT u.caseDetail.samNum as samId, u.caseDetail.childDemography.name as name, avgWeightGainKg as avgWtGain, clinicalImpression as clinicalImpression, dietaryAdvice as dietaryAdvice, medicalAdvice as medicalPrescription FROM DischargeChildDetail u where u.dischargeId = ?1")
    Optional<DischargeDetailsModel> findByDischargeId(int dischargeId);

    // @Query("SELECT u.caseDetail.samNum as samId, u.caseDetail.childDemography.name as name FROM DischargeChildDetail u where u.caseDetail.samId = ?1")
    // List<DischargeDetailsModel> findBySamId(int samId);

    @Query("SELECT a.heightCm as heightCm, a.weightKg as weightKg, u.avgWeightGainKg as avgWeightGainKg, u.clinicalImpression as clinicalImpression, u.dietaryAdvice as dietaryAdvice, u.medicalAdvice as medicalAdvice, o.outcome as outcome, u.treatmentGiven as treatmentGiven FROM DischargeChildDetail u, Outcome o, ChildGrowth a where o.outcomeId=u.outcomeId and a.caseDetail.caseId=u.caseDetail.caseId and a.recordedAtDischarge=1 and u.dischargeId = ?1")
    Optional<DischargeModel> getDischargeById(int dischargeId);

    @Query("SELECT c.comorbidCondition as comorbidCondition  from ComorbidConditionValue c, DischargeComorbidCondition d where d.caseDetail.caseId=?1 and d.comorbidId=c.comorbidId")
    List<String> getComorbidById(int caseId);

    @Query("SELECT a.heightCm as heightCm, a.weightKg as weightKg, u.avgWeightGainKg as avgWeightGainKg, u.clinicalImpression as clinicalImpression, u.dietaryAdvice as dietaryAdvice, u.medicalAdvice as medicalAdvice, o.outcome as outcome, u.treatmentGiven as treatmentGiven FROM DischargeChildDetail u, Outcome o, ChildGrowth a where o.outcomeId=u.outcomeId and a.caseDetail.caseId=u.caseDetail.caseId and a.recordedAtDischarge=1 and u.caseDetail.caseId = ?1")
    DischargeModel getDischargeByCaseId(int caseId);

}


