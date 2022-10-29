package com.phc.phc.model;

import java.sql.Timestamp;

public interface DischargedPatientModel {

     Long getRchId();
     String getName();
     Timestamp getDischargeDate();
     String getDischargeId();
     String getSamId();

     Integer getCaseId();
//    public Long getRchId() {
//        return rchId;
//    }
//
//    public void setRchId(Long rchId) {
//        this.rchId = rchId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Timestamp getDischargeDate() {
//        return dischargeDate;
//    }
//
//    public void setDischargeDate(Timestamp dischargeDate) {
//        this.dischargeDate = dischargeDate;
//    }
}
