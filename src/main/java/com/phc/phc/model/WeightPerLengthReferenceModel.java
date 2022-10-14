package com.phc.phc.model;

public class WeightPerLengthReferenceModel {
	private double averageWeightInKg;
	private double maximumWeightInKg;
    private double minimumWeightInKg;
    private double heightInCM;
    private String gender;
    
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
	public double getHeightInCM() {
		return heightInCM;
	}
	public void setHeightInCM(double heightInCM) {
		this.heightInCM = heightInCM;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
