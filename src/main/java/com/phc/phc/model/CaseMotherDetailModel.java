package com.phc.phc.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CaseMotherDetailModel {
	
	
	private Integer breastFeedingAtPresent;
	private Integer drugsPrescribed;
	private String drugsPrescribedDetails;
	private String lastMenstruationDate;
	private Integer medicalProblem;
	private String medicalProblemDetails;
	private Integer noOfChildren;
	private Integer noOfMealsPerDay;
	private Integer pregnantAtPresent;
	private BigDecimal numberOfPregnancyMonths;
	private String presentDietaryChoice;
	private Integer registeredForAnc;
	private Integer riskCategoryId;
	
	
	public String getDrugsPrescribedDetails() {
		return drugsPrescribedDetails;
	}
	public void setDrugsPrescribedDetails(String drugsPrescribedDetails) {
		this.drugsPrescribedDetails = drugsPrescribedDetails;
	}
	
	public Integer getBreastFeedingAtPresent() {
		return breastFeedingAtPresent;
	}
	public void setBreastFeedingAtPresent(Integer breastFeedingAtPresent) {
		this.breastFeedingAtPresent = breastFeedingAtPresent;
	}
	public Integer getDrugsPrescribed() {
		return drugsPrescribed;
	}
	public void setDrugsPrescribed(Integer drugsPrescribed) {
		this.drugsPrescribed = drugsPrescribed;
	}
	public Integer getMedicalProblem() {
		return medicalProblem;
	}
	public void setMedicalProblem(Integer medicalProblem) {
		this.medicalProblem = medicalProblem;
	}
	public Integer getPregnantAtPresent() {
		return pregnantAtPresent;
	}
	public void setPregnantAtPresent(Integer pregnantAtPresent) {
		this.pregnantAtPresent = pregnantAtPresent;
	}
	public Integer getRegisteredForAnc() {
		return registeredForAnc;
	}
	public void setRegisteredForAnc(Integer registeredForAnc) {
		this.registeredForAnc = registeredForAnc;
	}
	public String getLastMenstruationDate() {
		return lastMenstruationDate;
	}
	public void setLastMenstruationDate(String lastMenstruationDate) {
		this.lastMenstruationDate = lastMenstruationDate;
	}
	
	public String getMedicalProblemDetails() {
		return medicalProblemDetails;
	}
	public void setMedicalProblemDetails(String medicalProblemDetails) {
		this.medicalProblemDetails = medicalProblemDetails;
	}
	public Integer getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(Integer noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public Integer getNoOfMealsPerDay() {
		return noOfMealsPerDay;
	}
	public void setNoOfMealsPerDay(Integer noOfMealsPerDay) {
		this.noOfMealsPerDay = noOfMealsPerDay;
	}
	
	public String getPresentDietaryChoice() {
		return presentDietaryChoice;
	}
	public void setPresentDietaryChoice(String presentDietaryChoice) {
		this.presentDietaryChoice = presentDietaryChoice;
	}
	
	public BigDecimal getNumberOfPregnancyMonths() {
		return numberOfPregnancyMonths;
	}
	public void setNumberOfPregnancyMonths(BigDecimal numberOfPregnancyMonths) {
		this.numberOfPregnancyMonths = numberOfPregnancyMonths;
	}
	public Integer getRiskCategoryId() {
		return riskCategoryId;
	}
	public void setRiskCategoryId(Integer riskCategoryId) {
		this.riskCategoryId = riskCategoryId;
	}
	
	
	public boolean checkNull() throws IllegalAccessException {
	    for (Field f : getClass().getDeclaredFields())
	        if (f.get(this) != null)
	            return false;
	    return true;            
	}
	


}
