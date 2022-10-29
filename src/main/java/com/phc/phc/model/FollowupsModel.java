package com.phc.phc.model;

import java.util.Date;

public class FollowupsModel {
    private Long caseId;
    private Long followupId;
    private Long scheduleId;
    private Long samNum;
    private String childName;
    private String ashaName;
    private Long followupsDone;
    private Date nextCommunity;
    private Date nextNrc;

    public Long getSamNum() {
        return samNum;
    }

    public void setSamNum(Long samNum) {
        this.samNum = samNum;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getAshaName() {
        return ashaName;
    }

    public void setAshaName(String ashaName) {
        this.ashaName = ashaName;
    }

    public Long getFollowupsDone() {
        return followupsDone;
    }

    public void setFollowupsDone(Long followupsDone) {
        this.followupsDone = followupsDone;
    }

    public Date getNextCommunity() {
        return nextCommunity;
    }

    public void setNextCommunity(Date nextCommunity) {
        this.nextCommunity = nextCommunity;
    }

    public Date getNextNrc() {
        return nextNrc;
    }

    public void setNextNrc(Date nextNrc) {
        this.nextNrc = nextNrc;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getFollowupId() {
        return followupId;
    }

    public void setFollowupId(Long followupId) {
        this.followupId = followupId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public FollowupsModel(Long samNum, String childName, String ashaName, Long followupsDone, Date nextCommunity, Date nextNrc) {
        this.samNum = samNum;
        this.childName = childName;
        this.ashaName = ashaName;
        this.followupsDone = followupsDone;
        this.nextCommunity = nextCommunity;
        this.nextNrc = nextNrc;
    }

    public FollowupsModel() {
    }

    public FollowupsModel(Long caseId, Long followupId) {
        this.caseId = caseId;
        this.followupId = followupId;
    }

    public FollowupsModel(Long samNum, Long caseId, Long followupId, Long scheduleId, String childName, String ashaName, Long followupsDone, Date nextCommunity, Date nextNrc) {
        this.caseId = caseId;
        this.followupId = followupId;
        this.scheduleId = scheduleId;
        this.samNum = samNum;
        this.childName = childName;
        this.ashaName = ashaName;
        this.followupsDone = followupsDone;
        this.nextCommunity = nextCommunity;
        this.nextNrc = nextNrc;
    }
}