package com.phc.phc.repository;

import com.phc.phc.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer>  {

//    @Query("Select c. from Notification u, CaseDetails c")
//    List<String> getNotification();
}
