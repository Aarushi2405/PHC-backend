package com.phc.phc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the discharge_child_details database table.
 * 
 */
@Entity
@Table(name="nr.discharge_child_details")
//@NamedQuery(name="DischargeChildDetail.findAll", query="SELECT d FROM DischargeChildDetail d")
public class DischargeChildDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="discharge_id")
	private int dischargeId;

	@Column(name="avg_weight_gain_kg")
	private BigDecimal avgWeightGainKg;

	@Column(name="clinical_impression")
	private String clinicalImpression;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="dietary_advice")
	private String dietaryAdvice;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="medical_advice")
	private String medicalAdvice;

	@Column(name="outcome_id")
	private int outcomeId;

	@Column(name="treatment_given")
	private String treatmentGiven;
//
//	bi-directional many-to-one association to CaseDetail
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

//	private int case_id;
//	private int created_by;
//	private int last_updated_by;


	public DischargeChildDetail() {
	}
//
	public int getDischargeId() {
		return this.dischargeId;
	}

	public void setDischargeId(int dischargeId) {
		this.dischargeId = dischargeId;
	}

	public BigDecimal getAvgWeightGainKg() {
		return this.avgWeightGainKg;
	}

	public void setAvgWeightGainKg(BigDecimal avgWeightGainKg) {
		this.avgWeightGainKg = avgWeightGainKg;
	}

	public String getClinicalImpression() {
		return this.clinicalImpression;
	}

	public void setClinicalImpression(String clinicalImpression) {
		this.clinicalImpression = clinicalImpression;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDietaryAdvice() {
		return this.dietaryAdvice;
	}

	public void setDietaryAdvice(String dietaryAdvice) {
		this.dietaryAdvice = dietaryAdvice;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getMedicalAdvice() {
		return this.medicalAdvice;
	}

	public void setMedicalAdvice(String medicalAdvice) {
		this.medicalAdvice = medicalAdvice;
	}

	public int getOutcomeId() {
		return this.outcomeId;
	}

	public void setOutcomeId(int outcomeId) {
		this.outcomeId = outcomeId;
	}

	public String getTreatmentGiven() {
		return this.treatmentGiven;
	}

	public void setTreatmentGiven(String treatmentGiven) {
		this.treatmentGiven = treatmentGiven;
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
//
	public void setLastUpdatedBy(NrcUser lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

//		public int getCaseDetail() {
//		return this.case_id;
//	}

//	public void setCaseDetail(int case_id) {
//		this.case_id = case_id;
//	}
//
//	public int getCreatedBy() {
//		return created_by;
//	}
//
//	public void setCreatedBy(int created_by) {
//		this.created_by = created_by;
//	}
//
//	public int getLastUpdatedBy() {
//		return last_updated_by;
//	}
//
//	public void setLastUpdatedBy(int last_updated_by) {
//		this.last_updated_by = last_updated_by;
//	}

}