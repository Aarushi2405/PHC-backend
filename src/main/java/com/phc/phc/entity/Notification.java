package com.phc.phc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="case_id")
    private int caseId;

    @Column(name="phc")
    private int phc;

    @Column(name="accept_status")
    private String acceptStatus;

    @Column(name="date")
    private Timestamp date;

    @Column(name="reject_reason")
    private String rejectReason;

    @Column(name="suggested_phc")
    private String suggestedPhc;

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getSuggestedPhc() {
        return suggestedPhc;
    }

    public void setSuggestedPhc(String suggestedPhc) {
        this.suggestedPhc = suggestedPhc;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getPhc() {
        return phc;
    }

    public void setPhc(int phc) {
        this.phc = phc;
    }

    public String getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(String acceptStatus) {
        this.acceptStatus = acceptStatus;
    }
}
