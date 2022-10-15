package com.phc.phc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface ChildDetailsModel {
    int getCaseId();
    int getSamNum();
    String getAddress();
    Long getRchId();
    Timestamp getDischargeDate();
    BigDecimal getDischargeSd();
    Integer getPincode();
    String getMobileNumber();
    String getName();
    String getGender();
    Integer getAgeInMonths();

}
