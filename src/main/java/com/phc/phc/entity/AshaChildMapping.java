package com.phc.phc.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="asha_child_mapping")
public class AshaChildMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ref_id")
    private int refId;

    @Column(name="case_id")
    private int caseId;

//    @Column(name="asha_id")
//    private int ashaId;
//
//    public int getAshaId() {
//        return ashaId;
//    }
//
//    public void setAshaId(int ashaId) {
//        this.ashaId = ashaId;
//    }

    @ManyToOne
    @JoinColumn(name = "asha_id")
    private AshaWorker ashaWorker;

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public AshaWorker getAshaWorker() {
        return ashaWorker;
    }

    public void setAshaWorker(AshaWorker ashaWorker) {
        this.ashaWorker = ashaWorker;
    }
}
