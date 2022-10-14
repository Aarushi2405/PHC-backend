package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the medical_risk database table.
 * 
 */
@Entity
@Table(name="config.medical_risk")
@NamedQuery(name="MedicalRisk.findAll", query="SELECT m FROM MedicalRisk m")
public class MedicalRisk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="medical_risk_id")
	private int medicalRiskId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="medical_risk")
	private String medicalRisk;

	public MedicalRisk() {
	}

	public int getMedicalRiskId() {
		return this.medicalRiskId;
	}

	public void setMedicalRiskId(int medicalRiskId) {
		this.medicalRiskId = medicalRiskId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getMedicalRisk() {
		return this.medicalRisk;
	}

	public void setMedicalRisk(String medicalRisk) {
		this.medicalRisk = medicalRisk;
	}

}