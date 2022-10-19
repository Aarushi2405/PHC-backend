package com.phc.phc.model;

import java.util.Date;

public class FollowupDates {

    private Long caseId;
    private Long scheduleId;
    private Long followupId;
    private Long type;
    private Long status;
    private Date followupDate;

    public FollowupDates(Long caseId, Long scheduleId, Long followupId, Long type, Long status, Date followupDate) {
        this.caseId = caseId;
        this.scheduleId = scheduleId;
        this.followupId = followupId;
        this.type = type;
        this.status = status;
        this.followupDate = followupDate;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }
}
