package com.phc.phc.repository;

import com.phc.phc.entity.Notification;
import com.phc.phc.model.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer>  {

    @Query("Select u.date as date, c.caseId as caseId,c.samNum as samId, c.childDemography.rchId as rchId, c.childDemography.name as name, c.childDemography.addressLine1 as address, c.childDemography.pincode as pincode, c.childDemography.mobileNumber as mobileNumber from Notification u, CaseDetail c where u.caseId=c.caseId and (u.acceptStatus='NO' or u.acceptStatus='No')")
    List<NotificationModel> getNotification();

    @Query("Select u.date as date, c.caseId as caseId,c.samNum as samId, c.childDemography.rchId as rchId, c.childDemography.name as name, c.childDemography.addressLine1 as address, c.childDemography.pincode as pincode, c.childDemography.mobileNumber as mobileNumber from Notification u, CaseDetail c where u.caseId=c.caseId and u.acceptStatus='NO' and u.phc=?1")
    List<NotificationModel> getNotificationPhc(int phcId);

    @Modifying
    @Query("update Notification u set u.acceptStatus = 'YES' where u.caseId = ?1")
    void approve(int caseId);

    Notification findByCaseId(int caseId);

    @Query("Select u.caseId from Notification u where u.acceptStatus='YES'")
    List<Integer> getApproved();

    @Query("Select u.caseId from Notification u where u.phc=?1")
    List<Integer> getPhc(int phcId);
}
