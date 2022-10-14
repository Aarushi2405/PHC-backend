package com.phc.phc.model;

import java.math.BigDecimal;

public interface DischargeModel {
    BigDecimal getAvgWeightGainKg();
    BigDecimal getHeightCm();
    BigDecimal getWeightKg();
    String getClinicalImpression();
    String getDietaryAdvice();
    String getMedicalAdvice();
    String getOutcome();
    String getTreatmentGiven();

    }
