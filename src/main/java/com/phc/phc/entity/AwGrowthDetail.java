package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the aw_growth_details database table.
 * 
 */
@Entity
@Table(name="nr.aw_growth_details")
@NamedQuery(name="AwGrowthDetail.findAll", query="SELECT a FROM AwGrowthDetail a")
public class AwGrowthDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="growth_id")
	private int growthId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="actual_date")
	private Date actualDate;

	@Column(name="created_on")
	private Timestamp createdOn;
	

	@Column(name="height_cm")
	private BigDecimal heightCm;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="weight_kg")
	private BigDecimal weightKg;

	//bi-directional many-to-one association to CaseDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private CaseDetail caseDetail;

	public AwGrowthDetail() {
	}

	public Date getActualDate() {
		return this.actualDate;
	}

	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getGrowthId() {
		return this.growthId;
	}

	public void setGrowthId(int growthId) {
		this.growthId = growthId;
	}

	public BigDecimal getHeightCm() {
		return this.heightCm;
	}

	public void setHeightCm(BigDecimal heightCm) {
		this.heightCm = heightCm;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public BigDecimal getWeightKg() {
		return this.weightKg;
	}

	public void setWeightKg(BigDecimal weightKg) {
		this.weightKg = weightKg;
	}

	public CaseDetail getCaseDetail() {
		return this.caseDetail;
	}

	public void setCaseDetail(CaseDetail caseDetail) {
		this.caseDetail = caseDetail;
	}

}