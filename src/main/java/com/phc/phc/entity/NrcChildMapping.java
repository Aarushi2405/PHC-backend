package com.phc.phc.entity;

import javax.persistence.*;

@Entity
@Table(name="nrc_child_mapping")
public class NrcChildMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ref_id")
    private String refId;

    @Column(name="case_id")
    private int caseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nrc_id")
    private NrcList nrcList;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public NrcList getNrcList() {
        return nrcList;
    }

    public void setNrcList(NrcList nrcList) {
        this.nrcList = nrcList;
    }
}
