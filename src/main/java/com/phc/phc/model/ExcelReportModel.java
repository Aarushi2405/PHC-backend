package com.phc.phc.model;

import java.math.BigDecimal;

public class ExcelReportModel {
	//Added column for nrc user Id
	private String nrcUserId;
	private String nrcName;
	//Added column for no of beds
	private Integer noOfBeds;	
	private Integer scCount;
	private Integer stCount;
		
	private Integer admissionMaleBelow;
	private Integer admissionMaleAbove;	
	private Integer admissionFemaleBelow;
	private Integer admissionFemaleAbove;	
	/*private Integer admissionTotalBelow;
	private Integer admissionTotalAbove;*/
	
	//Added column for gen 
	private Integer genCount;	
	private Integer aplCount;
	private Integer bplCount;
	//Added column for others
	private Integer othersCount;
	private Integer admissions;
	
	private Integer wfhCount;
	private Integer muacCount;
	private Integer oedemaCount;
	private Integer wastingCount;
	
	private Integer selfCount;
	private Integer wardCount;
	private Integer flwCount;
	
	private Integer lessThanOneWkCount;
	private Integer oneToTwoWkCount;
	private Integer moreThanTwoWkCount;
	
	private Integer averageLengthStay;
	private Double bedOccupancyRate;
	private Integer achievedTargetWeight;
	private Integer achievedPartialWeight;
	private Integer averageWeightGain;
	
	
	private Integer discharges;
	private Integer recovered;
	private BigDecimal recoveryRate;
	private Integer defaulters;
	private BigDecimal defaulterRate;
	private Integer nonResponders;
	private Integer deaths;
	private BigDecimal deathRate;
	private Integer childDueFollowup;
	private Integer relapse;
	private Integer readmission;
	
	private String districtName;
	
	
	
	public String getNrcName() {
		return nrcName;
	}
	public void setNrcName(String nrcName) {
		this.nrcName = nrcName;
	}
	
	public Integer getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(Integer noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	
	public Integer getScCount() {
		return scCount;
	}
	public void setScCount(Integer scCount) {
		this.scCount = scCount;
	}
	public Integer getStCount() {
		return stCount;
	}
	public void setStCount(Integer stCount) {
		this.stCount = stCount;
	}
	public Integer getGenCount() {
		return genCount;
	}
	public void setGenCount(Integer genCount) {
		this.genCount = genCount;
	}
		
	public Integer getAplCount() {
		return aplCount;
	}
	public void setAplCount(Integer aplCount) {
		this.aplCount = aplCount;
	}
	public Integer getBplCount() {
		return bplCount;
	}
	public void setBplCount(Integer bplCount) {
		this.bplCount = bplCount;
	}
	public Integer getOthersCount() {
		return othersCount;
	}
	public void setOthersCount(Integer othersCount) {
		this.othersCount = othersCount;
	}
	public Integer getAdmissions() {
		return admissions;
	}
	public void setAdmissions(Integer admissions) {
		this.admissions = admissions;
	}
	
	public Integer getWfhCount() {
		return wfhCount;
	}
	public void setWfhCount(Integer wfhCount) {
		this.wfhCount = wfhCount;
	}
	public Integer getMuacCount() {
		return muacCount;
	}
	public void setMuacCount(Integer muacCount) {
		this.muacCount = muacCount;
	}
	public Integer getOedemaCount() {
		return oedemaCount;
	}
	public void setOedemaCount(Integer oedemaCount) {
		this.oedemaCount = oedemaCount;
	}
	public Integer getWastingCount() {
		return wastingCount;
	}
	public void setWastingCount(Integer wastingCount) {
		this.wastingCount = wastingCount;
	}
	
	public Integer getSelfCount() {
		return selfCount;
	}
	public void setSelfCount(Integer selfCount) {
		this.selfCount = selfCount;
	}
	public Integer getWardCount() {
		return wardCount;
	}
	public void setWardCount(Integer wardCount) {
		this.wardCount = wardCount;
	}
	public Integer getFlwCount() {
		return flwCount;
	}
	public void setFlwCount(Integer flwCount) {
		this.flwCount = flwCount;
	}
	
	public Integer getLessThanOneWkCount() {
		return lessThanOneWkCount;
	}
	public void setLessThanOneWkCount(Integer lessThanOneWkCount) {
		this.lessThanOneWkCount = lessThanOneWkCount;
	}
	public Integer getOneToTwoWkCount() {
		return oneToTwoWkCount;
	}
	public void setOneToTwoWkCount(Integer oneToTwoWkCount) {
		this.oneToTwoWkCount = oneToTwoWkCount;
	}
	public Integer getMoreThanTwoWkCount() {
		return moreThanTwoWkCount;
	}
	public void setMoreThanTwoWkCount(Integer moreThanTwoWkCount) {
		this.moreThanTwoWkCount = moreThanTwoWkCount;
	}
	
	public Integer getAverageLengthStay() {
		return averageLengthStay;
	}
	public void setAverageLengthStay(Integer averageLengthStay) {
		this.averageLengthStay = averageLengthStay;
	}
	public Double getBedOccupancyRate() {
		return bedOccupancyRate;
	}
	public void setBedOccupancyRate(Double bedOccupancyRate) {
		this.bedOccupancyRate = bedOccupancyRate;
	}
	public Integer getAchievedTargetWeight() {
		return achievedTargetWeight;
	}
	public void setAchievedTargetWeight(Integer achievedTargetWeight) {
		this.achievedTargetWeight = achievedTargetWeight;
	}
	public Integer getAverageWeightGain() {
		return averageWeightGain;
	}
	public void setAverageWeightGain(Integer averageWeightGain) {
		this.averageWeightGain = averageWeightGain;
	}
	public Integer getDischarges() {
		return discharges;
	}
	public void setDischarges(Integer discharges) {
		this.discharges = discharges;
	}
	public Integer getRecovered() {
		return recovered;
	}
	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}
	public BigDecimal getRecoveryRate() {
		return recoveryRate;
	}
	public void setRecoveryRate(BigDecimal recoveryRate) {
		this.recoveryRate = recoveryRate;
	}
	public Integer getDefaulters() {
		return defaulters;
	}
	public void setDefaulters(Integer defaulters) {
		this.defaulters = defaulters;
	}
	public BigDecimal getDefaulterRate() {
		return defaulterRate;
	}
	public void setDefaulterRate(BigDecimal defaulterRate) {
		this.defaulterRate = defaulterRate;
	}
	public Integer getNonResponders() {
		return nonResponders;
	}
	public void setNonResponders(Integer nonResponders) {
		this.nonResponders = nonResponders;
	}
	public Integer getDeaths() {
		return deaths;
	}
	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}
	public BigDecimal getDeathRate() {
		return deathRate;
	}
	public void setDeathRate(BigDecimal deathRate) {
		this.deathRate = deathRate;
	}
	public Integer getChildDueFollowup() {
		return childDueFollowup;
	}
	public void setChildDueFollowup(Integer childDueFollowup) {
		this.childDueFollowup = childDueFollowup;
	}
	public Integer getRelapse() {
		return relapse;
	}
	public void setRelapse(Integer relapse) {
		this.relapse = relapse;
	}
	public Integer getReadmission() {
		return readmission;
	}
	public void setReadmission(Integer readmission) {
		this.readmission = readmission;
	}
	public String getNrcUserId() {
		return nrcUserId;
	}
	public void setNrcUserId(String nrcUserId) {
		this.nrcUserId = nrcUserId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Integer getAchievedPartialWeight() {
		return achievedPartialWeight;
	}
	public void setAchievedPartialWeight(Integer achievedPartialWeight) {
		this.achievedPartialWeight = achievedPartialWeight;
	}
	
	public Integer getAdmissionMaleBelow() {
		return admissionMaleBelow;
	}
	public void setAdmissionMaleBelow(Integer admissionMaleBelow) {
		this.admissionMaleBelow = admissionMaleBelow;
	}
	public Integer getAdmissionMaleAbove() {
		return admissionMaleAbove;
	}
	public void setAdmissionMaleAbove(Integer admissionMaleAbove) {
		this.admissionMaleAbove = admissionMaleAbove;
	}
	public Integer getAdmissionFemaleBelow() {
		return admissionFemaleBelow;
	}
	public void setAdmissionFemaleBelow(Integer admissionFemaleBelow) {
		this.admissionFemaleBelow = admissionFemaleBelow;
	}
	public Integer getAdmissionFemaleAbove() {
		return admissionFemaleAbove;
	}
	public void setAdmissionFemaleAbove(Integer admissionFemaleAbove) {
		this.admissionFemaleAbove = admissionFemaleAbove;
	}	
}
