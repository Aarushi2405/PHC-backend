package com.phc.phc.model;

import java.util.Date;

public interface AshaFollowupModel {

    Date getFollowupDate();
    Long getHeight();
    Long getWeight();
    Long getHeadCircumference();
    Long getMuac();
    Long getSdRange();
    Long getFollowupId();
    Long getScheduleId();
}
