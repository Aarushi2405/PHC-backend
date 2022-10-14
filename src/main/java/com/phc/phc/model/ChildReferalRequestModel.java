package com.phc.phc.model;

import java.math.BigDecimal;


public class ChildReferalRequestModel implements AbstractModel {
	private Long referralId;
	private Long childReferralStatusId;
	private String referralRemark;
	private BigDecimal admissionTimeHeight;
	private BigDecimal admissionTimeWeight;
	private BigDecimal dischargeTimeHeight;
	private BigDecimal dischargeTimeWeight;
	private String nutritionIntakeAdvice;
	private String medicalAdvice;
	private String referalStatusLastUpdatedOn;
	
	public Long getReferralId() {
		return referralId;
	}
	public void setReferralId(Long referralId) {
		this.referralId = referralId;
	}
	public Long getChildReferralStatusId() {
		return childReferralStatusId;
	}
	public void setChildReferralStatusId(Long childReferralStatusId) {
		this.childReferralStatusId = childReferralStatusId;
	}
	public String getReferralRemark() {
		return referralRemark;
	}
	public void setReferralRemark(String referralRemark) {
		this.referralRemark = referralRemark;
	}
	public BigDecimal getAdmissionTimeHeight() {
		return admissionTimeHeight;
	}
	public void setAdmissionTimeHeight(BigDecimal admissionTimeHeight) {
		this.admissionTimeHeight = admissionTimeHeight;
	}
	public BigDecimal getAdmissionTimeWeight() {
		return admissionTimeWeight;
	}
	public void setAdmissionTimeWeight(BigDecimal admissionTimeWeight) {
		this.admissionTimeWeight = admissionTimeWeight;
	}
	public BigDecimal getDischargeTimeHeight() {
		return dischargeTimeHeight;
	}
	public void setDischargeTimeHeight(BigDecimal dischargeTimeHeight) {
		this.dischargeTimeHeight = dischargeTimeHeight;
	}
	public BigDecimal getDischargeTimeWeight() {
		return dischargeTimeWeight;
	}
	public void setDischargeTimeWeight(BigDecimal dischargeTimeWeight) {
		this.dischargeTimeWeight = dischargeTimeWeight;
	}
	public String getNutritionIntakeAdvice() {
		return nutritionIntakeAdvice;
	}
	public void setNutritionIntakeAdvice(String nutritionIntakeAdvice) {
		this.nutritionIntakeAdvice = nutritionIntakeAdvice;
	}
	public String getMedicalAdvice() {
		return medicalAdvice;
	}
	public void setMedicalAdvice(String medicalAdvice) {
		this.medicalAdvice = medicalAdvice;
	}
	public String getReferalStatusLastUpdatedOn() {
		return referalStatusLastUpdatedOn;
	}
	public void setReferalStatusLastUpdatedOn(String referalStatusLastUpdatedOn) {
		this.referalStatusLastUpdatedOn = referalStatusLastUpdatedOn;
	}
		
}
