package com.phc.phc.model;

public class ChildGrowthPerAgeRequestModel implements AbstractModel {

	private String sex;
	private Integer intervalInDays;
	private Integer intervalUpperLimit;
	private Integer intervalLowerLimit;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getIntervalInDays() {
		return intervalInDays;
	}
	public void setIntervalInDays(Integer intervalInDays) {
		this.intervalInDays = intervalInDays;
	}
	public Integer getIntervalUpperLimit() {
		return intervalUpperLimit;
	}
	public void setIntervalUpperLimit(Integer intervalUpperLimit) {
		this.intervalUpperLimit = intervalUpperLimit;
	}
	public Integer getIntervalLowerLimit() {
		return intervalLowerLimit;
	}
	public void setIntervalLowerLimit(Integer intervalLowerLimit) {
		this.intervalLowerLimit = intervalLowerLimit;
	}
}
