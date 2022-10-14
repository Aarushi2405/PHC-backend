package com.phc.phc.model;

import java.math.BigDecimal;

public class ChildMeasurementRequestModel{
	
	private Integer hospitalId;
	private Integer caseId;
	private Integer userId;
	private String measurementDate;
	private BigDecimal weightKg;
	private String diet;
	private String comments;
	
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public String getMeasurementDate() {
		return measurementDate;
	}
	public void setMeasurementDate(String measurementDate) {
		this.measurementDate = measurementDate;
	}
	public BigDecimal getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
} 
