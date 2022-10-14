package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the education_qualification database table.
 * 
 */
@Entity
@Table(name="config.education_qualification")
@NamedQuery(name="EducationQualification.findAll", query="SELECT e FROM EducationQualification e")
public class EducationQualification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="education_qualification_id")
	private int educationQualificationId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="education_qualification")
	private String educationQualification;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public EducationQualification() {
	}

	public int getEducationQualificationId() {
		return this.educationQualificationId;
	}

	public void setEducationQualificationId(int educationQualificationId) {
		this.educationQualificationId = educationQualificationId;
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

	public String getEducationQualification() {
		return this.educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}