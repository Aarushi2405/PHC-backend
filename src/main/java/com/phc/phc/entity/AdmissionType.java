package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the admission_type database table.
 * 
 */
@Entity
@Table(name="config.admission_type")
@NamedQuery(name="AdmissionType.findAll", query="SELECT a FROM AdmissionType a")
public class AdmissionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admission_type_id")
	private int admissionTypeId;

	@Column(name="admission_type")
	private String admissionType;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public AdmissionType() {
	}

	public int getAdmissionTypeId() {
		return this.admissionTypeId;
	}

	public void setAdmissionTypeId(int admissionTypeId) {
		this.admissionTypeId = admissionTypeId;
	}

	public String getAdmissionType() {
		return this.admissionType;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
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

}