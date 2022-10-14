package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the admission_criteria_values database table.
 * 
 */
@Entity
@Table(name="config.admission_criteria_values")
@NamedQuery(name="AdmissionCriteriaValue.findAll", query="SELECT a FROM AdmissionCriteriaValue a")
public class AdmissionCriteriaValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="criteria_id")
	private int criteriaId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String criteria;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public AdmissionCriteriaValue() {
	}

	public int getCriteriaId() {
		return this.criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
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