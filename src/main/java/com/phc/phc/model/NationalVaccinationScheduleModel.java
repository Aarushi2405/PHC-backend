package com.phc.phc.model;

public class NationalVaccinationScheduleModel implements AbstractModel {
	private Long immunityId; //Eqv to vaccinationScheduleId in Entity
	private Integer daysAfterDob; //Eqv to scheduleFromDobDays in entity
	private String immunityType; //Eqv to vacine in entity
	private String description; //Eqv to vaccineTxtDescShort in entity
	
	private Boolean isNormalSchedule;
	private Integer lapseAfterDays;
	private Integer minIntervalInSeriesDays;
	private String minIntervalInSeriesText;
	private Integer overDueFromDobDays;
	private String overdueAfterText;
	private String scheduleDescTxt;
	private String vacineSeries;
	private Long beneficiaryTypeId;
	private String beneficiaryType;
	private Integer sequenceInSeries;
	
	public Long getImmunityId() {
		return immunityId;
	}
	public void setImmunityId(Long immunityId) {
		this.immunityId = immunityId;
	}
	public Integer getDaysAfterDob() {
		return daysAfterDob;
	}
	public void setDaysAfterDob(Integer daysAfterDob) {
		this.daysAfterDob = daysAfterDob;
	}
	public String getImmunityType() {
		return immunityType;
	}
	public void setImmunityType(String immunityType) {
		this.immunityType = immunityType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsNormalSchedule() {
		return isNormalSchedule;
	}
	public void setIsNormalSchedule(Boolean isNormalSchedule) {
		this.isNormalSchedule = isNormalSchedule;
	}
	public Integer getLapseAfterDays() {
		return lapseAfterDays;
	}
	public void setLapseAfterDays(Integer lapseAfterDays) {
		this.lapseAfterDays = lapseAfterDays;
	}
	public Integer getMinIntervalInSeriesDays() {
		return minIntervalInSeriesDays;
	}
	public void setMinIntervalInSeriesDays(Integer minIntervalInSeriesDays) {
		this.minIntervalInSeriesDays = minIntervalInSeriesDays;
	}
	public String getMinIntervalInSeriesText() {
		return minIntervalInSeriesText;
	}
	public void setMinIntervalInSeriesText(String minIntervalInSeriesText) {
		this.minIntervalInSeriesText = minIntervalInSeriesText;
	}
	public Integer getOverDueFromDobDays() {
		return overDueFromDobDays;
	}
	public void setOverDueFromDobDays(Integer overDueFromDobDays) {
		this.overDueFromDobDays = overDueFromDobDays;
	}
	public String getOverdueAfterText() {
		return overdueAfterText;
	}
	public void setOverdueAfterText(String overdueAfterText) {
		this.overdueAfterText = overdueAfterText;
	}
	public String getScheduleDescTxt() {
		return scheduleDescTxt;
	}
	public void setScheduleDescTxt(String scheduleDescTxt) {
		this.scheduleDescTxt = scheduleDescTxt;
	}
	public String getVacineSeries() {
		return vacineSeries;
	}
	public void setVacineSeries(String vacineSeries) {
		this.vacineSeries = vacineSeries;
	}
	public Long getBeneficiaryTypeId() {
		return beneficiaryTypeId;
	}
	public void setBeneficiaryTypeId(Long beneficiartTypeId) {
		this.beneficiaryTypeId = beneficiartTypeId;
	}
	public String getBeneficiaryType() {
		return beneficiaryType;
	}
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}
	public Integer getSequenceInSeries() {
		return sequenceInSeries;
	}
	public void setSequenceInSeries(Integer sequenceInSeries) {
		this.sequenceInSeries = sequenceInSeries;
	}
}