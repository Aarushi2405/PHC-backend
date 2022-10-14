package com.phc.phc.model;

public class MonthlyReportModel {
	
	private String category = " ";
	private Integer maleLessThanCount = 0;
	private Integer maleGreaterThanCount = 0;
	private Integer femaleLessThanCount = 0;
	private Integer femaleGreaterThanCount = 0;
	private Integer totalLessThanCount = 0;
	private Integer totalGreaterThanCount = 0;
	private Integer grandTotal = 0;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getMaleLessThanCount() {
		return maleLessThanCount;
	}
	public void setMaleLessThanCount(Integer maleLessThanCount) {
		this.maleLessThanCount = maleLessThanCount;
	}
	public Integer getMaleGreaterThanCount() {
		return maleGreaterThanCount;
	}
	public void setMaleGreaterThanCount(Integer maleGreaterThanCount) {
		this.maleGreaterThanCount = maleGreaterThanCount;
	}
	public Integer getFemaleLessThanCount() {
		return femaleLessThanCount;
	}
	public void setFemaleLessThanCount(Integer femaleLessThanCount) {
		this.femaleLessThanCount = femaleLessThanCount;
	}
	public Integer getFemaleGreaterThanCount() {
		return femaleGreaterThanCount;
	}
	public void setFemaleGreaterThanCount(Integer femalGreaterThanCount) {
		this.femaleGreaterThanCount = femalGreaterThanCount;
	}
	public Integer getTotalLessThanCount() {
		return totalLessThanCount;
	}
	public void setTotalLessThanCount(Integer totalLessThanCount) {
		this.totalLessThanCount = totalLessThanCount;
	}
	public Integer getTotalGreaterThanCount() {
		return totalGreaterThanCount;
	}
	public void setTotalGreaterThanCount(Integer totalGreaterThanCount) {
		this.totalGreaterThanCount = totalGreaterThanCount;
	}
	public Integer getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Integer grandTotal) {
		this.grandTotal = grandTotal;
	}
	
}
