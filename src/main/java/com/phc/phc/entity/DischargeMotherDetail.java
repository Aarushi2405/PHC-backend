package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the discharge_mother_details database table.
 * 
 */
@Entity
@Table(name="nr.discharge_mother_details")
@NamedQuery(name="DischargeMotherDetail.findAll", query="SELECT d FROM DischargeMotherDetail d")
public class DischargeMotherDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="discharge_id")
	private int dischargeId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="medical_risk_id")
	private Integer medicalRiskId;

	//bi-directional many-to-one association to CaseDetail
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="case_id")
	private CaseDetail caseDetail;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private NrcUser createdBy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="last_updated_by")
	private NrcUser lastUpdatedBy;

	public DischargeMotherDetail() {
	}

	public int getDischargeId() {
		return this.dischargeId;
	}

	public void setDischargeId(int dischargeId) {
		this.dischargeId = dischargeId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Integer getMedicalRiskId() {
		return this.medicalRiskId;
	}

	public void setMedicalRiskId(Integer medicalRiskId) {
		this.medicalRiskId = medicalRiskId;
	}

	public CaseDetail getCaseDetail() {
		return this.caseDetail;
	}

	public void setCaseDetail(CaseDetail caseDetail) {
		this.caseDetail = caseDetail;
	}

	public NrcUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(NrcUser createdBy) {
		this.createdBy = createdBy;
	}

	public NrcUser getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(NrcUser lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	
	
}