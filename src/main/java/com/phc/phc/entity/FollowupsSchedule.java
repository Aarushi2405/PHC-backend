package com.phc.phc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="followups_schedule")
public class FollowupsSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name="followup_date")
    private Timestamp followupDate;

    @Column(name="status")
    private String status;

    @Column(name="type")
    private String type;

//    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_id")
    private CaseDetail caseDetail;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="followup_id")
    private FollowupDetails followupDetails;

//    public void setCaseId(int caseId){ this.caseDetail.setCaseId(caseId);}
//    public void setFollowupId(int followupId){this.followupDetails.setFollowupId(followupId);}
    public int getSchedule_id() {
        return scheduleId;
    }

    public void setSchedule_id(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Timestamp getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Timestamp followupDate) {
        this.followupDate = followupDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CaseDetail getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(CaseDetail caseDetail) {
        this.caseDetail = caseDetail;
    }

    public FollowupDetails getFollowupDetails() {
        return followupDetails;
    }

    public void setFollowupDetails(FollowupDetails followupDetails) {
        this.followupDetails = followupDetails;
    }
}
