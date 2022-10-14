package com.phc.phc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MonthlyReportList implements AbstractModel{
	
	//Added nrc User Id column
	private String nrcUserId;
	private String hospitalName;
	private String blockName;
	private String districtName;
	private String monthYear;
	private String reportPeriod;
	private Integer numberOfBeds;
	
	private BigDecimal deathRate;
	private BigDecimal defaulterRate;
	private BigDecimal recoveryRate;
	private Double bedOccupancyRate;
	
	List<MonthlyReportModel> admissionList = new ArrayList<>();
	List<MonthlyReportModel> admissionCriteriaList = new ArrayList<>();
	List<MonthlyReportModel> referralList = new ArrayList<>();
	List<MonthlyReportModel> durationList = new ArrayList<>();
	List<MonthlyReportModel> targetWeightList = new ArrayList<>();
	List<MonthlyReportModel> dischargeList = new ArrayList<>();
	List<MonthlyReportModel> avgWeightGainList = new ArrayList<>();
	List<MonthlyReportModel> avgStayDurationList = new ArrayList<>();
	List<MonthlyReportModel> admissionTotalList = new ArrayList<>();
	
	private List<HrTypeModel> officerList = new ArrayList<>();
	private List<HrTypeModel> nurseList = new ArrayList<>();
	private List<HrTypeModel> dieticianList = new ArrayList<>();
	private List<HrTypeModel> cookList = new ArrayList<>();
	private List<HrTypeModel> tenderList = new ArrayList<>();
	private List<HrTypeModel> mswList = new ArrayList<>();
	
	public List<MonthlyReportModel> getAdmissionList() {
		return admissionList;
	}
	public void setAdmissionList(List<MonthlyReportModel> admissionList) {
		this.admissionList = admissionList;
	}
	public List<MonthlyReportModel> getAdmissionCriteriaList() {
		return admissionCriteriaList;
	}
	public void setAdmissionCriteriaList(List<MonthlyReportModel> admissionCriteriaList) {
		this.admissionCriteriaList = admissionCriteriaList;
	}
	public List<MonthlyReportModel> getDurationList() {
		return durationList;
	}
	public void setDurationList(List<MonthlyReportModel> durationList) {
		this.durationList = durationList;
	}
	public List<MonthlyReportModel> getReferralList() {
		return referralList;
	}
	public void setReferralList(List<MonthlyReportModel> referralList) {
		this.referralList = referralList;
	}
	public List<MonthlyReportModel> getTargetWeightList() {
		return targetWeightList;
	}
	public void setTargetWeightList(List<MonthlyReportModel> targetWeightList) {
		this.targetWeightList = targetWeightList;
	}
	
	public List<MonthlyReportModel> getAvgWeightGainList() {
		return avgWeightGainList;
	}
	public void setAvgWeightGainList(List<MonthlyReportModel> avgWeightGainList) {
		this.avgWeightGainList = avgWeightGainList;
	}
	
		
	public List<MonthlyReportModel> getAvgStayDurationList() {
		return avgStayDurationList;
	}
	public void setAvgStayDurationList(List<MonthlyReportModel> avgStayDurationList) {
		this.avgStayDurationList = avgStayDurationList;
	}
	
	
	public List<MonthlyReportModel> getAdmissionTotalList() {
		return admissionTotalList;
	}
	public void setAdmissionTotalList(List<MonthlyReportModel> admissionTotalList) {
		this.admissionTotalList = admissionTotalList;
	}
	
	public List<MonthlyReportModel> getDischargeList() {
		return dischargeList;
	}
	public void setDischargeList(List<MonthlyReportModel> dischargeList) {
		this.dischargeList = dischargeList;
	}
	public BigDecimal getDeathRate() {
		return deathRate;
	}
	public void setDeathRate(BigDecimal deathRate) {
		this.deathRate = deathRate;
	}
	public BigDecimal getDefaulterRate() {
		return defaulterRate;
	}
	public void setDefaulterRate(BigDecimal defaulterRate) {
		this.defaulterRate = defaulterRate;
	}
	public BigDecimal getRecoveryRate() {
		return recoveryRate;
	}
	public void setRecoveryRate(BigDecimal recoveryRate) {
		this.recoveryRate = recoveryRate;
	}
	
	public Double getBedOccupancyRate() {
		return bedOccupancyRate;
	}
	public void setBedOccupancyRate(Double bedOccupancyRate) {
		this.bedOccupancyRate = bedOccupancyRate;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Integer getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(Integer numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	public String getMonthYear() {
		return monthYear;
	}
	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}
	public String getReportPeriod() {
		return reportPeriod;
	}
	public void setReportPeriod(String reportPeriod) {
		this.reportPeriod = reportPeriod;
	}
	public List<HrTypeModel> getOfficerList() {
		return officerList;
	}
	public void setOfficerList(List<HrTypeModel> officerList) {
		this.officerList = officerList;
	}
	public List<HrTypeModel> getNurseList() {
		return nurseList;
	}
	public void setNurseList(List<HrTypeModel> nurseList) {
		this.nurseList = nurseList;
	}
	public List<HrTypeModel> getDieticianList() {
		return dieticianList;
	}
	public void setDieticianList(List<HrTypeModel> dieticianList) {
		this.dieticianList = dieticianList;
	}
	public List<HrTypeModel> getCookList() {
		return cookList;
	}
	public void setCookList(List<HrTypeModel> cookList) {
		this.cookList = cookList;
	}
	public List<HrTypeModel> getTenderList() {
		return tenderList;
	}
	public void setTenderList(List<HrTypeModel> tenderList) {
		this.tenderList = tenderList;
	}
	public List<HrTypeModel> getMswList() {
		return mswList;
	}
	public void setMswList(List<HrTypeModel> mswList) {
		this.mswList = mswList;
	}
	public String getNrcUserId() {
		return nrcUserId;
	}
	public void setNrcUserId(String nrcUserId) {
		this.nrcUserId = nrcUserId;
	}	
}
