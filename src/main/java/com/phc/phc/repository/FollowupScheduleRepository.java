package com.phc.phc.repository;

import com.phc.phc.entity.CaseDetail;
import com.phc.phc.entity.FollowupSchedule;
import com.phc.phc.entity.FollowupsSchedule;
import com.phc.phc.model.FollowupDates;
import com.phc.phc.model.FollowupDatesModel;
import com.phc.phc.model.FollowupScheduleModel;
import com.phc.phc.model.FollowupsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//rch, name, asha, followups done, next comm followup, next nrc followup

public interface FollowupScheduleRepository extends JpaRepository<FollowupsSchedule, Integer> {

//    @Query("SELECT f.caseDetail.samNum as samNum, f.caseDetail.childDemography.name from FollowupsSchedule f inner join (select u.caseDetail.caseId as caseId, COUNT(u.status) as followupsDone FROM FollowupsSchedule u where u.status='DONE' GROUP BY u.caseDetail.caseId) k where k.caseId=f.caseDetails.caseId")
//    List<String> getFollowupSchedules();

    @Query("Select u.caseDetail.caseId as caseId, u.caseDetail.childDemography.rchId as rchId, u.scheduleId as scheduleId, u.followupDetails.followupId as followupId, u.caseDetail.samNum as samNum, u.caseDetail.childDemography.name as childName, m.ashaWorker.name as ashaName, m.ashaWorker.phoneNumber as ashaNumber,  m.ashaWorker.ashaId as ashaId, u.followupDate as followupDate, u.status as status, u.type as type from FollowupsSchedule u, AshaChildMapping m where u.caseDetail.caseId=m.caseId")
    List<FollowupScheduleModel> getFollowupSchedules();

    @Query("Select u.caseDetail.caseId as caseId, u.scheduleId as scheduleId, u.followupDetails.followupId as followupId, u.caseDetail.samNum as samNum, u.caseDetail.childDemography.name as childName, m.ashaWorker.name as ashaName, m.ashaWorker.phoneNumber as ashaNumber,  u.followupDate as followupDate, u.status as status, u.type as type from FollowupsSchedule u, AshaChildMapping m where u.caseDetail.caseId=m.caseId and u.caseDetail.caseId=?1 and u.status='DONE'")
    List<FollowupScheduleModel> getFollowupScheduleById(int caseId);



    @Query("Select u.caseDetail.caseId as caseId, u.scheduleId as scheduleId, u.followupDetails.followupId as followupId, u.caseDetail.samNum as samNum, u.followupDate as followupDate, u.type as type, u.status as status, u.type as type from FollowupsSchedule u where u.caseDetail.caseId = ?1")
    List<FollowupDatesModel> getFollowupDates(int caseId);

//    FollowupsModel
}
