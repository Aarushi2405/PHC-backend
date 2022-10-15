package com.phc.phc.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="followups_schedule")
public class FollowupsSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private int schedule_id;

    @Column(name="followup_date")
    private Timestamp followup_date;

    @Column(name="status")
    private String status;

    @Column(name="type")
    private String type;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="case_id")
    private CaseDetail caseDetail;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="followup_id")
    private FollowupDetails followupDetails;

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Timestamp getFollowup_date() {
        return followup_date;
    }

    public void setFollowup_date(Timestamp followup_date) {
        this.followup_date = followup_date;
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
