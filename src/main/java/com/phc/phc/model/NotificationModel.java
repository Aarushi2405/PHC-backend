package com.phc.phc.model;

import java.sql.Timestamp;

public interface NotificationModel {
     int getCaseId();
     String getName();
     String getAddress();
     String getPincode();
     String getMobileNumber();
     Long getSamId();
     Long getRchId();

     Timestamp getDate();

}
