package com.phc.phc.model;

public class ChildImmunitySchedule implements AbstractModel {
	String scheduledDate;
	String remarks;
	String actionTaken;
	Long childId;
	Long childImmunityRecordId;
	String childFName = "";
	String childLName = "";
	Long anganwadiWorkerId;
	String actualDate;
	String actionDate;
	String immunizationScheduleDate;
	String childGender;
	Long immunizationPlaceId;
	String immunizationPlace;
	String dob;
	String childExternalReferenceId;
	String encodedImageString;
	Boolean synchFromRchFlag = new Boolean(false);
	
	private ServiceAuthInfoModel serviceAuthInfo;
	
	NationalVaccinationScheduleModel immunityDescriptionModel;
	public String getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(String scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public NationalVaccinationScheduleModel getImmunityDescriptionModel() {
		return immunityDescriptionModel;
	}
	public void setImmunityDescriptionModel(NationalVaccinationScheduleModel immunityDescriptionModel) {
		this.immunityDescriptionModel = immunityDescriptionModel;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	public Long getChildId() {
		return childId;
	}
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	public Long getChildImmunityRecordId() {
		return childImmunityRecordId;
	}
	public void setChildImmunityRecordId(Long childImmunityRecordId) {
		this.childImmunityRecordId = childImmunityRecordId;
	}
	public String getChildFName() {
		return childFName;
	}
	public void setChildFName(String childFName) {
		this.childFName = childFName;
	}
	public String getChildLName() {
		return childLName;
	}
	public void setChildLName(String childLName) {
		this.childLName = childLName;
	}
	public Long getAnganwadiWorkerId() {
		return anganwadiWorkerId;
	}
	public void setAnganwadiWorkerId(Long anganwadiWorkerId) {
		this.anganwadiWorkerId = anganwadiWorkerId;
	}
	public String getActualDate() {
		return actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}
	public String getActionDate() {
		return actionDate;
	}
	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}
	public String getImmunizationScheduleDate() {
		return immunizationScheduleDate;
	}
	public void setImmunizationScheduleDate(String immunizationScheduleDate) {
		this.immunizationScheduleDate = immunizationScheduleDate;
	}
	public String getChildGender() {
		return childGender;
	}
	public void setChildGender(String childGender) {
		this.childGender = childGender;
	}
	public Long getImmunizationPlaceId() {
		return immunizationPlaceId;
	}
	public void setImmunizationPlaceId(Long immunizationPlaceId) {
		this.immunizationPlaceId = immunizationPlaceId;
	}
	public String getImmunizationPlace() {
		return immunizationPlace;
	}
	public void setImmunizationPlace(String immunizationPlace) {
		this.immunizationPlace = immunizationPlace;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getChildExternalReferenceId() {
		return childExternalReferenceId;
	}
	public void setChildExternalReferenceId(String childExternalReferenceId) {
		this.childExternalReferenceId = childExternalReferenceId;
	}
	public String getEncodedImageString() {
		return encodedImageString;
	}
	public void setEncodedImageString(String encodedImageString) {
		this.encodedImageString = encodedImageString;
	}
	public ServiceAuthInfoModel getServiceAuthInfo() {
		return serviceAuthInfo;
	}
	public void setServiceAuthInfo(ServiceAuthInfoModel serviceAuthInfo) {
		this.serviceAuthInfo = serviceAuthInfo;
	}
	public Boolean getSynchFromRchFlag() {
		return synchFromRchFlag;
	}
	public void setSynchFromRchFlag(Boolean synchFromRchFlag) {
		this.synchFromRchFlag = synchFromRchFlag;
	}
}
