package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the risk_category database table.
 * 
 */
@Entity
@Table(name="config.risk_category")
@NamedQuery(name="RiskCategory.findAll", query="SELECT r FROM RiskCategory r")
public class RiskCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="risk_category_id")
	private int riskCategoryId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="risk_category")
	private String riskCategory;

	public RiskCategory() {
	}

	public int getRiskCategoryId() {
		return this.riskCategoryId;
	}

	public void setRiskCategoryId(int riskCategoryId) {
		this.riskCategoryId = riskCategoryId;
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

	public String getRiskCategory() {
		return this.riskCategory;
	}

	public void setRiskCategory(String riskCategory) {
		this.riskCategory = riskCategory;
	}

}