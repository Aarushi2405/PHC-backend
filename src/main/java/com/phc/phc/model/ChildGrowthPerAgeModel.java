package com.phc.phc.model;

public class ChildGrowthPerAgeModel implements AbstractModel {
	
	//For Response purpose
	private double averageHeightInCm;
	private double maximumHeightInCm;
	private double minimumHeightInCm;
	private double averageWeightInKg;
	private double maximumWeightInKg;
    private double minimumWeightInKg;
	private Integer ageInDays;
	private String sex;
	private Integer childAgeInYear;
	private Integer childAgeInMonth;
	
	
	public double getAverageHeightInCm() {
		return averageHeightInCm;
	}
	public void setAverageHeightInCm(double averageHeightInCm) {
		this.averageHeightInCm = averageHeightInCm;
	}
	public double getMaximumHeightInCm() {
		return maximumHeightInCm;
	}
	public void setMaximumHeightInCm(double maximumHeightInCm) {
		this.maximumHeightInCm = maximumHeightInCm;
	}
	public double getMinimumHeightInCm() {
		return minimumHeightInCm;
	}
	public void setMinimumHeightInCm(double minimumHeightInCm) {
		this.minimumHeightInCm = minimumHeightInCm;
	}
	public double getAverageWeightInKg() {
		return averageWeightInKg;
	}
	public void setAverageWeightInKg(double averageWeightInKg) {
		this.averageWeightInKg = averageWeightInKg;
	}
	public double getMaximumWeightInKg() {
		return maximumWeightInKg;
	}
	public void setMaximumWeightInKg(double maximumWeightInKg) {
		this.maximumWeightInKg = maximumWeightInKg;
	}
	public double getMinimumWeightInKg() {
		return minimumWeightInKg;
	}
	public void setMinimumWeightInKg(double minimumWeightInKg) {
		this.minimumWeightInKg = minimumWeightInKg;
	}
	public Integer getAgeInDays() {
		return ageInDays;
	}
	public void setAgeInDays(Integer ageInDays) {
		this.ageInDays = ageInDays;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getChildAgeInYear() {
		return childAgeInYear;
	}
	public void setChildAgeInYear(Integer childAgeInYear) {
		this.childAgeInYear = childAgeInYear;
	}
	public Integer getChildAgeInMonth() {
		return childAgeInMonth;
	}
	public void setChildAgeInMonth(Integer childAgeInMonth) {
		this.childAgeInMonth = childAgeInMonth;
	}
	

}