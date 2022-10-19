package com.phc.phc.model;

import java.util.Date;

public class UpdateDataModel {

    private Long scheduleId;
    private Long followupId;

    public UpdateDataModel(Long caseId, Long scheduleId, Long followupId, Long type, Long status, Date followupDate) {
        this.scheduleId = scheduleId;
        this.followupId = followupId;

    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getFollowupId() {
        return followupId;
    }

    public void setFollowupId(Long followupId) {
        this.followupId = followupId;
    }

}
