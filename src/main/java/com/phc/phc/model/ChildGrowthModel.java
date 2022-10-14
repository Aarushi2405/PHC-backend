package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;


public class ChildGrowthModel implements AbstractModel {
	private String date;
	private Long childId;
	private String heightInCM;
	private String weightInKG;
	private String startDate;
	private String endDate;
	private Boolean isSam;
	private Long childAgeInDays;
	private Long childAgeInMonths;
	private Long childAgeInYears;
	private String childMuac;
	private String childHeadLenInCM;
	private String childChecstInCM ;
	private String muacCode;
	private String weightRAGIndicator;
	private String heightRAGIndicator;
	private String wastingRAGindicator;
	
	private Long childGrowthRecId;
	private String dateOfMeasurement;
	
	private ServiceAuthInfoModel serviceAuthInfo;
	
	private Integer measurementMonth;
	private Integer measurementYear;
	
	private boolean heightInfoDervived = false;
	private String derivedHeightInfoDate;
	
	private boolean weightInfoDervived = false;
	private String derivedWeightInfoDate;
	
	private boolean muacInfoDervived = false;
	private String derivedMuacInfoDate;
	
	private boolean muacCodeInfoDervived = false;
	private String derivedMuacCodeInfoDate;
	
	private boolean measurementTakenFromReferral = false;
	
	//Added code changes for community followup
	private Long referalId;
	private Integer iFlagReferal;
	private Long growthRecId;
	private Long snehaFollowUpScheduleId;
	private Long departmentFollowUpScheduleId;
	
	private List<Integer> growthIssueList = new ArrayList<Integer>();	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getChildId() {
		return childId;
	}
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	public String getHeightInCM() {
		return heightInCM;
	}
	public void setHeightInCM(String heightInCM) {
		this.heightInCM = heightInCM;
	}
	public String getWeightInKG() {
		return weightInKG;
	}
	public void setWeightInKG(String weightInKG) {
		this.weightInKG = weightInKG;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Boolean isSam() {
		return isSam;
	}
	public void setSam(Boolean isSam) {
		this.isSam = isSam;
	}
	
	public Boolean getIsSam() {
		return isSam;
	}
	public void setIsSam(Boolean isSam) {
		this.isSam = isSam;
	}
	
	public String getChildMuac() {
		return childMuac;
	}
	public void setChildMuac(String childMuac) {
		this.childMuac = childMuac;
	}
	public String getChildHeadLenInCM() {
		return childHeadLenInCM;
	}
	public void setChildHeadLenInCM(String childHeadLenInCM) {
		this.childHeadLenInCM = childHeadLenInCM;
	}
	public String getChildChecstInCM() {
		return childChecstInCM;
	}
	public void setChildChecstInCM(String childChecstInCM) {
		this.childChecstInCM = childChecstInCM;
	}
	public List<Integer> getGrowthIssueList() {
		return growthIssueList;
	}
	public void setGrowthIssueList(List<Integer> growthIssueList) {
		this.growthIssueList = growthIssueList;
	}
	public String getMuacCode() {
		return muacCode;
	}
	public void setMuacCode(String muacCode) {
		this.muacCode = muacCode;
	}
	public String getWeightRAGIndicator() {
		return weightRAGIndicator;
	}
	public void setWeightRAGIndicator(String weightRAGIndicator) {
		this.weightRAGIndicator = weightRAGIndicator;
	}
	public Long getChildGrowthRecId() {
		return childGrowthRecId;
	}
	public void setChildGrowthRecId(Long childGrowthRecId) {
		this.childGrowthRecId = childGrowthRecId;
	}
	public String getDateOfMeasurement() {
		return dateOfMeasurement;
	}
	public void setDateOfMeasurement(String dateOfMeasurement) {
		this.dateOfMeasurement = dateOfMeasurement;
	}
	public String getHeightRAGIndicator() {
		return heightRAGIndicator;
	}
	public void setHeightRAGIndicator(String heightRAGIndicator) {
		this.heightRAGIndicator = heightRAGIndicator;
	}
	public ServiceAuthInfoModel getServiceAuthInfo() {
		return serviceAuthInfo;
	}
	public void setServiceAuthInfo(ServiceAuthInfoModel serviceAuthInfo) {
		this.serviceAuthInfo = serviceAuthInfo;
	}
	public String getWastingRAGindicator() {
		return wastingRAGindicator;
	}
	public void setWastingRAGindicator(String wastingRAGindicator) {
		this.wastingRAGindicator = wastingRAGindicator;
	}
	public Integer getMeasurementMonth() {
		return measurementMonth;
	}
	public void setMeasurementMonth(Integer measurementMonth) {
		this.measurementMonth = measurementMonth;
	}
	public Integer getMeasurementYear() {
		return measurementYear;
	}
	public void setMeasurementYear(Integer measurementYear) {
		this.measurementYear = measurementYear;
	}
	public boolean isHeightInfoDervived() {
		return heightInfoDervived;
	}
	public void setHeightInfoDervived(boolean heightInfoDervived) {
		this.heightInfoDervived = heightInfoDervived;
	}
	public boolean isWeightInfoDervived() {
		return weightInfoDervived;
	}
	public void setWeightInfoDervived(boolean weightInfoDervived) {
		this.weightInfoDervived = weightInfoDervived;
	}
	
	public boolean isMuacInfoDervived() {
		return muacInfoDervived;
	}
	public void setMuacInfoDervived(boolean muacInfoDervived) {
		this.muacInfoDervived = muacInfoDervived;
	}
	
	public boolean isMuacCodeInfoDervived() {
		return muacCodeInfoDervived;
	}
	public void setMuacCodeInfoDervived(boolean muacCodeInfoDervived) {
		this.muacCodeInfoDervived = muacCodeInfoDervived;
	}
	public String getDerivedHeightInfoDate() {
		return derivedHeightInfoDate;
	}
	public void setDerivedHeightInfoDate(String derivedHeightInfoDate) {
		this.derivedHeightInfoDate = derivedHeightInfoDate;
	}
	public String getDerivedWeightInfoDate() {
		return derivedWeightInfoDate;
	}
	public void setDerivedWeightInfoDate(String derivedWeightInfoDate) {
		this.derivedWeightInfoDate = derivedWeightInfoDate;
	}
	public String getDerivedMuacInfoDate() {
		return derivedMuacInfoDate;
	}
	public void setDerivedMuacInfoDate(String derivedMuacInfoDate) {
		this.derivedMuacInfoDate = derivedMuacInfoDate;
	}
	public String getDerivedMuacCodeInfoDate() {
		return derivedMuacCodeInfoDate;
	}
	public void setDerivedMuacCodeInfoDate(String derivedMuacCodeInfoDate) {
		this.derivedMuacCodeInfoDate = derivedMuacCodeInfoDate;
	}
	public Long getChildAgeInDays() {
		return childAgeInDays;
	}
	public void setChildAgeInDays(Long childAgeInDays) {
		this.childAgeInDays = childAgeInDays;
	}
	public Long getChildAgeInMonths() {
		return childAgeInMonths;
	}
	public void setChildAgeInMonths(Long childAgeInMonths) {
		this.childAgeInMonths = childAgeInMonths;
	}
	public Long getChildAgeInYears() {
		return childAgeInYears;
	}
	public void setChildAgeInYears(Long childAgeInYears) {
		this.childAgeInYears = childAgeInYears;
	}
	public boolean isMeasurementTakenFromReferral() {
		return measurementTakenFromReferral;
	}
	public void setMeasurementTakenFromReferral(boolean measurementTakenFromReferral) {
		this.measurementTakenFromReferral = measurementTakenFromReferral;
	}
	public Long getReferalId() {
		return referalId;
	}
	public void setReferalId(Long referalId) {
		this.referalId = referalId;
	}
	public Integer getiFlagReferal() {
		return iFlagReferal;
	}
	public void setiFlagReferal(Integer iFlagReferal) {
		this.iFlagReferal = iFlagReferal;
	}
	public Long getGrowthRecId() {
		return growthRecId;
	}
	public void setGrowthRecId(Long growthRecId) {
		this.growthRecId = growthRecId;
	}
	public Long getSnehaFollowUpScheduleId() {
		return snehaFollowUpScheduleId;
	}
	public void setSnehaFollowUpScheduleId(Long snehaFollowUpScheduleId) {
		this.snehaFollowUpScheduleId = snehaFollowUpScheduleId;
	}
	public Long getDepartmentFollowUpScheduleId() {
		return departmentFollowUpScheduleId;
	}
	public void setDepartmentFollowUpScheduleId(Long departmentFollowUpScheduleId) {
		this.departmentFollowUpScheduleId = departmentFollowUpScheduleId;
	}
	
}