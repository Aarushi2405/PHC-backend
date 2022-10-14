package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the case_mother_growth database table.
 * 
 */
@Entity
@Table(name="nr.case_mother_growth")
@NamedQuery(name="CaseMotherGrowth.findAll", query="SELECT c FROM CaseMotherGrowth c")
public class CaseMotherGrowth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	@Column(name="blood_pressure_dia")
	private BigDecimal bloodPressureDia;

	@Column(name="blood_pressure_sys")
	private BigDecimal bloodPressureSys;

	@Column(name="blood_sugar_fasting")
	private BigDecimal bloodSugarFasting;

	@Column(name="blood_sugar_random")
	private BigDecimal bloodSugarRandom;

	private BigDecimal bmi;

	@Column(name="created_on")
	private Timestamp createdOn;

	private Integer gravida;

	@Column(name="height_cm")
	private BigDecimal heightCm;

	private BigDecimal hemoglobin;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;
    
	@Temporal(TemporalType.DATE)
	@Column(name="measurement_date")
	private Date measurementDate;

	@Column(name="muac_cm")
	private BigDecimal muacCm;

	@Column(name="neck_circumference_cm")
	private BigDecimal neckCircumferenceCm;

	private Integer para;
	
	@Column(name="advice")
	private String advice;

	@Column(name="recorded_at_admission")
	private Boolean recordedAtAdmission;

	@Column(name="recorded_at_discharge")
	private Boolean recordedAtDischarge;

	@Column(name="weight_kg")
	private BigDecimal weightKg;

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

	public CaseMotherGrowth() {
	}

	public int getRecId() {
		return this.recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
	}

	public BigDecimal getBloodPressureDia() {
		return this.bloodPressureDia;
	}

	public void setBloodPressureDia(BigDecimal bloodPressureDia) {
		this.bloodPressureDia = bloodPressureDia;
	}

	public BigDecimal getBloodPressureSys() {
		return this.bloodPressureSys;
	}

	public void setBloodPressureSys(BigDecimal bloodPressureSys) {
		this.bloodPressureSys = bloodPressureSys;
	}

	public BigDecimal getBloodSugarFasting() {
		return this.bloodSugarFasting;
	}

	public void setBloodSugarFasting(BigDecimal bloodSugarFasting) {
		this.bloodSugarFasting = bloodSugarFasting;
	}

	public BigDecimal getBloodSugarRandom() {
		return this.bloodSugarRandom;
	}

	public void setBloodSugarRandom(BigDecimal bloodSugarRandom) {
		this.bloodSugarRandom = bloodSugarRandom;
	}

	public BigDecimal getBmi() {
		return this.bmi;
	}

	public void setBmi(BigDecimal bmi) {
		this.bmi = bmi;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getGravida() {
		return this.gravida;
	}

	public void setGravida(Integer gravida) {
		this.gravida = gravida;
	}

	public BigDecimal getHeightCm() {
		return this.heightCm;
	}

	public void setHeightCm(BigDecimal heightCm) {
		this.heightCm = heightCm;
	}

	public BigDecimal getHemoglobin() {
		return this.hemoglobin;
	}

	public void setHemoglobin(BigDecimal hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	

	public Date getMeasurementDate() {
		return measurementDate;
	}

	public void setMeasurementDate(Date measurementDate) {
		this.measurementDate = measurementDate;
	}

	public BigDecimal getMuacCm() {
		return this.muacCm;
	}

	public void setMuacCm(BigDecimal muacCm) {
		this.muacCm = muacCm;
	}

	public BigDecimal getNeckCircumferenceCm() {
		return this.neckCircumferenceCm;
	}

	public void setNeckCircumferenceCm(BigDecimal neckCircumferenceCm) {
		this.neckCircumferenceCm = neckCircumferenceCm;
	}

	public Integer getPara() {
		return this.para;
	}

	public void setPara(Integer para) {
		this.para = para;
	}

	public boolean getRecordedAtAdmission() {
		return this.recordedAtAdmission;
	}

	public void setRecordedAtAdmission(Boolean recordedAtAdmission) {
		this.recordedAtAdmission = recordedAtAdmission;
	}

	public boolean getRecordedAtDischarge() {
		return this.recordedAtDischarge;
	}

	public void setRecordedAtDischarge(Boolean recordedAtDischarge) {
		this.recordedAtDischarge = recordedAtDischarge;
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

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	
	

}