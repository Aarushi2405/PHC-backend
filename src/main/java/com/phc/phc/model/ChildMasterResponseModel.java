package com.phc.phc.model;


import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public class ChildMasterResponseModel {
	private Long childId;
	private String address = "";
	private String fatherContactNumber = "";
	private String motherContactNumber = "";
	private String dob = "";
	private String fatherFName = "";
	private String fatherLName = "";
	private byte[] imageUrlBlob;
	private String motherFName = "";
	private String motherLName = "";
	private String childFName = "";
	private String childLName = "";
	private String sex = "";
	private Long anganwadiId;
	
	private String anganwadiName;
	private String anganwadiAddress;
	private String anganwadiWorkerName;
	private String anganwadiPhoneNumber;
	
	private List<ChildGrowthModel> childGrowthList = new ArrayList<ChildGrowthModel>();
	private List<ChildAttendanceModel> childAttendanceRecords = new ArrayList<ChildAttendanceModel>();
	private List<ChildAttendanceModel> childDailyNutritionRecords = new ArrayList<ChildAttendanceModel>();
	private List<ChildImmunitySchedule> childImmunityScheduleList = new ArrayList<ChildImmunitySchedule>();
	private Long childAgeInMonths;
	private String uidAadharNumber;
	private String category;
	private MultipartFile childImage;
	private String encodedImageString;

	private Long childFamRecId;
	private Long fatherFamRecId;
	private Long motherFamRecId;
	private String childExternalReferenceId;
	private String uniqueIdTtype;
	private String childHeightStatus;
	private String childWeightStatus;
	private String childMuacStatus;
	private Boolean enrolledForEducation;
	private Boolean collectingThr;
	private Boolean leftPlace;
	private String mothersCardId;

	private Long familySurveNumber;
	private Long childSequenceInFamily;

	private Long childRchId;
	private Long motherRchId;

	//Added for edit part
	private Double weightAtBirth;
	private Long uniqueIdTtypeId;
    private String uniqueIdNumber;
    private Long childFamilySerialNumber;
	private Long fatherUniqueIdTypeId;
	private String fatherUniqueIdType;
	private String fatherUniqueIdNumber;
	private Long fatherRchId;
	private Long fatherFamilySerialNumber;
	private String religion;
	private String fatherDOB;
	private Long motherUniqueIdTypeId;
	private String motherUniqueIdType;
	private String motherUniqueIdNumber;
	private Long motherFamilySerialNumber;
	private String motherDOB;
	private String addressFLine;
	private String addressSLine;
	private String addressTLine;
	private String pinCode;
	private String pobState;
	private String pobDistrict;
	private String pobWard;
	private Long districtId;
	private String districtName;
	private Long familyRcId;
	private String familyRefName;
	private Integer houseHoldSurveyNumber;
	private Boolean minorityInState;
	private String minorityStatus;
	private String dateOfRegistration;
	
	private String lastDoneHomeVisitType;
	private Long lastDoneHomeVisitTypeId;
	private String lastDoneHomeVisitDate;
	
	private String rchRegistrationRAGIndicator;
	
	
	public Long getChildId() {
		return childId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherContactNumber() {
		return fatherContactNumber;
	}

	public void setFatherContactNumber(String fatherContactNumber) {
		this.fatherContactNumber = fatherContactNumber;
	}

	public String getMotherContactNumber() {
		return motherContactNumber;
	}

	public void setMotherContactNumber(String motherContactNumber) {
		this.motherContactNumber = motherContactNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFatherFName() {
		return fatherFName;
	}

	public void setFatherFName(String fatherFName) {
		this.fatherFName = fatherFName;
	}

	public String getFatherLName() {
		return fatherLName;
	}

	public void setFatherLName(String fatherLName) {
		this.fatherLName = fatherLName;
	}

	public byte[] getImageUrlBlob() {
		return imageUrlBlob;
	}

	public void setImageUrlBlob(byte[] imageUrlBlob) {
		this.imageUrlBlob = imageUrlBlob;
	}

	public String getMotherFName() {
		return motherFName;
	}

	public void setMotherFName(String motherFName) {
		this.motherFName = motherFName;
	}

	public String getMotherLName() {
		return motherLName;
	}

	public void setMotherLName(String motherLName) {
		this.motherLName = motherLName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public Long getAnganwadiId() {
		return anganwadiId;
	}

	public void setAnganwadiId(Long anganwadiId) {
		this.anganwadiId = anganwadiId;
	}

	public List<ChildAttendanceModel> getChildAttendanceRecords() {
		return childAttendanceRecords;
	}

	public void setChildAttendanceRecords(List<ChildAttendanceModel> childAttendanceRecords) {
		this.childAttendanceRecords = childAttendanceRecords;
	}

	public List<ChildImmunitySchedule> getChildImmunityScheduleList() {
		return childImmunityScheduleList;
	}

	public void setChildImmunityScheduleList(List<ChildImmunitySchedule> childImmunityScheduleList) {
		this.childImmunityScheduleList = childImmunityScheduleList;
	}

	public List<ChildGrowthModel> getChildGrowthList() {
		return childGrowthList;
	}

	public void setChildGrowthList(List<ChildGrowthModel> childGrowthList) {
		this.childGrowthList = childGrowthList;
	}

	public Long getChildAgeInMonths() {
		return childAgeInMonths;
	}

	public void setChildAgeInMonths(Long childAgeInMonths) {
		this.childAgeInMonths = childAgeInMonths;
	}

	public String getUidAadharNumber() {
		return uidAadharNumber;
	}

	public void setUidAadharNumber(String uidAadharNumber) {
		this.uidAadharNumber = uidAadharNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public MultipartFile getChildImage() {
		return childImage;
	}

	public void setChildImage(MultipartFile childImage) {
		this.childImage = childImage;
	}

	public String getEncodedImageString() {
		return encodedImageString;
	}

	public void setEncodedImageString(String encodedImageString) {
		this.encodedImageString = encodedImageString;
	}

	public Long getChildFamRecId() {
		return childFamRecId;
	}

	public void setChildFamRecId(Long childFamRecId) {
		this.childFamRecId = childFamRecId;
	}

	public Long getFatherFamRecId() {
		return fatherFamRecId;
	}

	public void setFatherFamRecId(Long fatherFamRecId) {
		this.fatherFamRecId = fatherFamRecId;
	}

	public Long getMotherFamRecId() {
		return motherFamRecId;
	}

	public void setMotherFamRecId(Long motherFamRecId) {
		this.motherFamRecId = motherFamRecId;
	}

	public String getUniqueIdTtype() {
		return uniqueIdTtype;
	}

	public void setUniqueIdTtype(String uniqueIdTtype) {
		this.uniqueIdTtype = uniqueIdTtype;
	}

	public String getChildExternalReferenceId() {
		return childExternalReferenceId;
	}

	public void setChildExternalReferenceId(String childExternalReferenceId) {
		this.childExternalReferenceId = childExternalReferenceId;
	}

	public String getChildHeightStatus() {
		return childHeightStatus;
	}

	public void setChildHeightStatus(String childHeightStatus) {
		this.childHeightStatus = childHeightStatus;
	}

	public String getChildWeightStatus() {
		return childWeightStatus;
	}

	public void setChildWeightStatus(String childWeightStatus) {
		this.childWeightStatus = childWeightStatus;
	}

	public String getChildMuacStatus() {
		return childMuacStatus;
	}

	public void setChildMuacStatus(String childMuacStatus) {
		this.childMuacStatus = childMuacStatus;
	}

	public Boolean getEnrolledForEducation() {
		return enrolledForEducation;
	}

	public void setEnrolledForEducation(Boolean enrolledForEducation) {
		this.enrolledForEducation = enrolledForEducation;
	}

	public Boolean getLeftPlace() {
		return leftPlace;
	}

	public void setLeftPlace(Boolean leftPlace) {
		this.leftPlace = leftPlace;
	}

	public Boolean getCollectingThr() {
		return collectingThr;
	}

	public void setCollectingThr(Boolean collectingThr) {
		this.collectingThr = collectingThr;
	}

	public String getMothersCardId() {
		return mothersCardId;
	}

	public void setMothersCardId(String mothersCardId) {
		this.mothersCardId = mothersCardId;
	}

	public Long getFamilySurveNumber() {
		return familySurveNumber;
	}

	public void setFamilySurveNumber(Long familySurveNumber) {
		this.familySurveNumber = familySurveNumber;
	}

	public Long getChildSequenceInFamily() {
		return childSequenceInFamily;
	}

	public void setChildSequenceInFamily(Long childSequenceInFamily) {
		this.childSequenceInFamily = childSequenceInFamily;
	}

	public Long getChildRchId() {
		return childRchId;
	}

	public void setChildRchId(Long childRchId) {
		this.childRchId = childRchId;
	}

	public Long getMotherRchId() {
		return motherRchId;
	}

	public void setMotherRchId(Long motherRchId) {
		this.motherRchId = motherRchId;
	}

	public List<ChildAttendanceModel> getChildDailyNutritionRecords() {
		return childDailyNutritionRecords;
	}

	public void setChildDailyNutritionRecords(List<ChildAttendanceModel> childDailyNutritionRecords) {
		this.childDailyNutritionRecords = childDailyNutritionRecords;
	}

	public Double getWeightAtBirth() {
		return weightAtBirth;
	}

	public void setWeightAtBirth(Double weightAtBirth) {
		this.weightAtBirth = weightAtBirth;
	}

	public Long getUniqueIdTtypeId() {
		return uniqueIdTtypeId;
	}

	public void setUniqueIdTtypeId(Long uniqueIdTtypeId) {
		this.uniqueIdTtypeId = uniqueIdTtypeId;
	}

	public Long getFatherUniqueIdTypeId() {
		return fatherUniqueIdTypeId;
	}

	public void setFatherUniqueIdTypeId(Long fatherUniqueIdTypeId) {
		this.fatherUniqueIdTypeId = fatherUniqueIdTypeId;
	}

	public String getFatherUniqueIdNumber() {
		return fatherUniqueIdNumber;
	}

	public void setFatherUniqueIdNumber(String fatherUniqueIdNumber) {
		this.fatherUniqueIdNumber = fatherUniqueIdNumber;
	}

	public Long getFatherRchId() {
		return fatherRchId;
	}

	public void setFatherRchId(Long fatherRchId) {
		this.fatherRchId = fatherRchId;
	}

	public Long getFatherFamilySerialNumber() {
		return fatherFamilySerialNumber;
	}

	public void setFatherFamilySerialNumber(Long fatherFamilySerialNumber) {
		this.fatherFamilySerialNumber = fatherFamilySerialNumber;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherDOB() {
		return fatherDOB;
	}

	public void setFatherDOB(String fatherDOB) {
		this.fatherDOB = fatherDOB;
	}

	public Long getMotherUniqueIdTypeId() {
		return motherUniqueIdTypeId;
	}

	public void setMotherUniqueIdTypeId(Long motherUniqueIdTypeId) {
		this.motherUniqueIdTypeId = motherUniqueIdTypeId;
	}

	public String getMotherUniqueIdNumber() {
		return motherUniqueIdNumber;
	}

	public void setMotherUniqueIdNumber(String motherUniqueIdNumber) {
		this.motherUniqueIdNumber = motherUniqueIdNumber;
	}

	public Long getMotherFamilySerialNumber() {
		return motherFamilySerialNumber;
	}

	public void setMotherFamilySerialNumber(Long motherFamilySerialNumber) {
		this.motherFamilySerialNumber = motherFamilySerialNumber;
	}

	public String getMotherDOB() {
		return motherDOB;
	}

	public void setMotherDOB(String motherDOB) {
		this.motherDOB = motherDOB;
	}

	public String getAddressFLine() {
		return addressFLine;
	}

	public void setAddressFLine(String addressFLine) {
		this.addressFLine = addressFLine;
	}

	public String getAddressSLine() {
		return addressSLine;
	}

	public void setAddressSLine(String addressSLine) {
		this.addressSLine = addressSLine;
	}

	public String getAddressTLine() {
		return addressTLine;
	}

	public void setAddressTLine(String addressTLine) {
		this.addressTLine = addressTLine;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPobState() {
		return pobState;
	}

	public void setPobState(String pobState) {
		this.pobState = pobState;
	}

	public String getPobDistrict() {
		return pobDistrict;
	}

	public void setPobDistrict(String pobDistrict) {
		this.pobDistrict = pobDistrict;
	}

	public String getPobWard() {
		return pobWard;
	}

	public void setPobWard(String pobWard) {
		this.pobWard = pobWard;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getFamilyRcId() {
		return familyRcId;
	}

	public void setFamilyRcId(Long familyRcId) {
		this.familyRcId = familyRcId;
	}

	public String getFamilyRefName() {
		return familyRefName;
	}

	public void setFamilyRefName(String familyRefName) {
		this.familyRefName = familyRefName;
	}

	public Integer getHouseHoldSurveyNumber() {
		return houseHoldSurveyNumber;
	}

	public void setHouseHoldSurveyNumber(Integer houseHoldSurveyNumber) {
		this.houseHoldSurveyNumber = houseHoldSurveyNumber;
	}

	public Boolean getMinorityInState() {
		return minorityInState;
	}

	public void setMinorityInState(Boolean minorityInState) {
		this.minorityInState = minorityInState;
	}

	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}

	public String getFatherUniqueIdType() {
		return fatherUniqueIdType;
	}

	public void setFatherUniqueIdType(String fatherUniqueIdType) {
		this.fatherUniqueIdType = fatherUniqueIdType;
	}

	public String getMotherUniqueIdType() {
		return motherUniqueIdType;
	}

	public void setMotherUniqueIdType(String motherUniqueIdType) {
		this.motherUniqueIdType = motherUniqueIdType;
	}

	public Long getChildFamilySerialNumber() {
		return childFamilySerialNumber;
	}

	public void setChildFamilySerialNumber(Long childFamilySerialNumber) {
		this.childFamilySerialNumber = childFamilySerialNumber;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getMinorityStatus() {
		return minorityStatus;
	}

	public void setMinorityStatus(String minorityStatus) {
		this.minorityStatus = minorityStatus;
	}

	public String getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getLastDoneHomeVisitType() {
		return lastDoneHomeVisitType;
	}

	public void setLastDoneHomeVisitType(String lastDoneHomeVisitType) {
		this.lastDoneHomeVisitType = lastDoneHomeVisitType;
	}

	public Long getLastDoneHomeVisitTypeId() {
		return lastDoneHomeVisitTypeId;
	}

	public void setLastDoneHomeVisitTypeId(Long lastDoneHomeVisitTypeId) {
		this.lastDoneHomeVisitTypeId = lastDoneHomeVisitTypeId;
	}

	public String getLastDoneHomeVisitDate() {
		return lastDoneHomeVisitDate;
	}

	public void setLastDoneHomeVisitDate(String lastDoneHomeVisitDate) {
		this.lastDoneHomeVisitDate = lastDoneHomeVisitDate;
	}

	public String getAnganwadiName() {
		return anganwadiName;
	}

	public void setAnganwadiName(String anganwadiName) {
		this.anganwadiName = anganwadiName;
	}

	public String getAnganwadiAddress() {
		return anganwadiAddress;
	}

	public void setAnganwadiAddress(String anganwadiAddress) {
		this.anganwadiAddress = anganwadiAddress;
	}

	public String getAnganwadiWorkerName() {
		return anganwadiWorkerName;
	}

	public void setAnganwadiWorkerName(String anganwadiWorkerName) {
		this.anganwadiWorkerName = anganwadiWorkerName;
	}

	public String getAnganwadiPhoneNumber() {
		return anganwadiPhoneNumber;
	}

	public void setAnganwadiPhoneNumber(String anganwadiPhoneNumber) {
		this.anganwadiPhoneNumber = anganwadiPhoneNumber;
	}

	public String getRchRegistrationRAGIndicator() {
		return rchRegistrationRAGIndicator;
	}

	public void setRchRegistrationRAGIndicator(String rchRegistrationRAGIndicator) {
		this.rchRegistrationRAGIndicator = rchRegistrationRAGIndicator;
	}

}