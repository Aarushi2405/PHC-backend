package com.phc.phc.model;

import java.util.Date;

public interface FollowupDatesModel {
    Long getScheduleId();
    Long getFollowupId();
    Long getCaseId();
//    Long getSamNum();
//    String getChildName();
//    String getAshaName();
    Date getFollowupDate();
    String getStatus();
    String getType();


}
