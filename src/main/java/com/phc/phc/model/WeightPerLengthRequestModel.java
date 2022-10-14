package com.phc.phc.model;

import java.math.BigDecimal;

public class WeightPerLengthRequestModel {
	private String gender;
	private BigDecimal maxHeight;
	private BigDecimal minHeight;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public BigDecimal getMaxHeight() {
		return maxHeight;
	}
	public void setMaxHeight(BigDecimal maxHeight) {
		this.maxHeight = maxHeight;
	}
	public BigDecimal getMinHeight() {
		return minHeight;
	}
	public void setMinHeight(BigDecimal minHeight) {
		this.minHeight = minHeight;
	}
}
