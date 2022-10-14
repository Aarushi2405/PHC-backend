package com.phc.phc.model;

public class SimpleDateModel {
	Long days;
	Long months;
	Long years;
	public Long getDays() {
		return days;
	}
	public void setDays(Long days) {
		this.days = days;
	}
	public Long getMonths() {
		return months;
	}
	public void setMonths(Long months) {
		this.months = months;
	}
	public Long getYears() {
		return years;
	}
	public void setYears(Long years) {
		this.years = years;
	}
	@Override
	public String toString() {
		return "SimpleDateModel [days=" + days + ", months=" + months + ", years=" + years + "]";
	}
	
	
}
