package com.phc.phc.model;

public class RejectModel {

    private int caseId;
    private String rejectReason;
    private String suggestedPhc;

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

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
}
