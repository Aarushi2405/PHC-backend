package com.phc.phc.model;

public class MotherRequestModel implements AbstractModel {
	
	private int age;
	private String dateOfBirth;
	private int educationQualificationId;
	private Boolean familyPlanning;
	private String name;
	private long rchId;
	private int loginUserId;
	private int motherId;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getEducationQualificationId() {
		return educationQualificationId;
	}
	public void setEducationQualificationId(int educationQualificationId) {
		this.educationQualificationId = educationQualificationId;
	}
	public Boolean isFamilyPlanning() {
		return familyPlanning;
	}
	public void setFamilyPlanning(Boolean familyPlanning) {
		this.familyPlanning = familyPlanning;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRchId() {
		return rchId;
	}
	public void setRchId(long rchId) {
		this.rchId = rchId;
	}
	public int getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(int loginUserId) {
		this.loginUserId = loginUserId;
	}
	public int getMotherId() {
		return motherId;
	}
	public void setMotherId(int motherId) {
		this.motherId = motherId;
	}
	
	
	
}
