package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the comorbid_condition_values database table.
 * 
 */
@Entity
@Table(name="config.comorbid_condition_values")
@NamedQuery(name="ComorbidConditionValue.findAll", query="SELECT c FROM ComorbidConditionValue c")
public class ComorbidConditionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comorbid_id")
	private int comorbidId;

	@Column(name="comorbid_condition")
	private String comorbidCondition;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public ComorbidConditionValue() {
	}

	public int getComorbidId() {
		return this.comorbidId;
	}

	public void setComorbidId(int comorbidId) {
		this.comorbidId = comorbidId;
	}

	public String getComorbidCondition() {
		return this.comorbidCondition;
	}

	public void setComorbidCondition(String comorbidCondition) {
		this.comorbidCondition = comorbidCondition;
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