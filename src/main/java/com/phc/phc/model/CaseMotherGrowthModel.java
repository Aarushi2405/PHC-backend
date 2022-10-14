package com.phc.phc.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CaseMotherGrowthModel {
	
	
	private BigDecimal bloodPressureDia;
	private BigDecimal bloodPressureSys;
	private BigDecimal bloodSugarFasting;
	private BigDecimal bloodSugarRandom;
	private BigDecimal bmi;
	private Integer gravida;
	private BigDecimal heightCm;
	private BigDecimal hemoglobin;
	private BigDecimal muacCm;
	private BigDecimal neckCircumferenceCm;
	private Integer para;
	private BigDecimal weightKg;
	private String advice;
	
	public BigDecimal getBloodPressureDia() {
		return bloodPressureDia;
	}
	public void setBloodPressureDia(BigDecimal bloodPressureDia) {
		this.bloodPressureDia = bloodPressureDia;
	}
	public BigDecimal getBloodPressureSys() {
		return bloodPressureSys;
	}
	public void setBloodPressureSys(BigDecimal bloodPressureSys) {
		this.bloodPressureSys = bloodPressureSys;
	}
	public BigDecimal getBloodSugarFasting() {
		return bloodSugarFasting;
	}
	public void setBloodSugarFasting(BigDecimal bloodSugarFasting) {
		this.bloodSugarFasting = bloodSugarFasting;
	}
	public BigDecimal getBloodSugarRandom() {
		return bloodSugarRandom;
	}
	public void setBloodSugarRandom(BigDecimal bloodSugarRandom) {
		this.bloodSugarRandom = bloodSugarRandom;
	}
	public BigDecimal getBmi() {
		return bmi;
	}
	public void setBmi(BigDecimal bmi) {
		this.bmi = bmi;
	}
	public Integer getGravida() {
		return gravida;
	}
	public void setGravida(Integer gravida) {
		this.gravida = gravida;
	}
	public BigDecimal getHeightCm() {
		return heightCm;
	}
	public void setHeightCm(BigDecimal heightCm) {
		this.heightCm = heightCm;
	}
	public BigDecimal getHemoglobin() {
		return hemoglobin;
	}
	public void setHemoglobin(BigDecimal hemoglobin) {
		this.hemoglobin = hemoglobin;
	}
	
	
	public BigDecimal getMuacCm() {
		return muacCm;
	}
	public void setMuacCm(BigDecimal muacCm) {
		this.muacCm = muacCm;
	}
	public BigDecimal getNeckCircumferenceCm() {
		return neckCircumferenceCm;
	}
	public void setNeckCircumferenceCm(BigDecimal neckCircumferenceCm) {
		this.neckCircumferenceCm = neckCircumferenceCm;
	}
	public Integer getPara() {
		return para;
	}
	public void setPara(Integer para) {
		this.para = para;
	}
	public BigDecimal getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	public boolean checkNull() throws IllegalAccessException {
	    for (Field f : getClass().getDeclaredFields())
	        if (f.get(this) != null)
	            return false;
	    return true;            
	}

	
}
