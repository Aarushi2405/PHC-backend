package com.phc.phc.model;


public class ChildRequestModel implements AbstractModel{
	
	private int childId;
	private String address;
	private int age;
	private Integer casteId;
	private String category;
	private int motherId;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String name;
	private long rchId;
	private Integer religionId;
	private int loginUserId;
	
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMotherId() {
		return motherId;
	}
	public void setMotherId(int motherId) {
		this.motherId = motherId;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	public Integer getCasteId() {
		return casteId;
	}
	public void setCasteId(Integer casteId) {
		this.casteId = casteId;
	}
	public Integer getReligionId() {
		return religionId;
	}
	public void setReligionId(Integer religionId) {
		this.religionId = religionId;
	}
	
	
	
	

}
