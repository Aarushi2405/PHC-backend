package com.phc.phc.model;

import java.util.Date;

public interface FollowupScheduleModel {
    Long getScheduleId();
    Long getFollowupId();
    Long getCaseId();
    Long getSamNum();
    String getChildName();
    String getAshaName();
    Date getFollowupDate();
    String getStatus();
    String getType();

    String getAshaNumber();

    Long getAshaId();
    Long getRchId();
    String getMobileNumber();
    String getPlace();

    Long getSdRange();

//    String getAshaMobileNumber();


}
