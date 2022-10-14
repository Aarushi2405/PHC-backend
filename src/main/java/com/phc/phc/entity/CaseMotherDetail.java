package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the case_mother_details database table.
 * 
 */
@Entity
@Table(name="nr.case_mother_details")
@NamedQuery(name="CaseMotherDetail.findAll", query="SELECT c FROM CaseMotherDetail c")
public class CaseMotherDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="case_m_details_id")
	private int caseMDetailsId;

	@Column(name="breast_feeding_at_present")
	private Boolean breastFeedingAtPresent;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="drugs_prescribed")
	private Boolean drugsPrescribed;

	@Column(name="drugs_prescribed_details")
	private String drugsPrescribedDetails;
    
	@Temporal(TemporalType.DATE)
	@Column(name="last_menstruation_date")
	private Date lastMenstruationDate;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="medical_problem")
	private Boolean medicalProblem;

	@Column(name="medical_problem_details")
	private String medicalProblemDetails;

	@Column(name="no_of_children")
	private Integer noOfChildren;

	@Column(name="no_of_meals_per_day")
	private Integer noOfMealsPerDay;
	
	@Column(name="number_of_pregnancy_months")
	private BigDecimal numberOfPregnancyMonths;

	@Column(name="pregnant_at_present")
	private Boolean pregnantAtPresent;

	@Column(name="present_dietary_choice")
	private String presentDietaryChoice;

	@Column(name="registered_for_anc")
	private Boolean registeredForAnc;
	
	@Column(name="risk_category_id")
	private Integer riskCategoryId;


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

	public CaseMotherDetail() {
	}

	public int getCaseMDetailsId() {
		return this.caseMDetailsId;
	}

	public void setCaseMDetailsId(int caseMDetailsId) {
		this.caseMDetailsId = caseMDetailsId;
	}

	public Boolean getBreastFeedingAtPresent() {
		return this.breastFeedingAtPresent;
	}

	public void setBreastFeedingAtPresent(Boolean breastFeedingAtPresent) {
		this.breastFeedingAtPresent = breastFeedingAtPresent;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getDrugsPrescribed() {
		return this.drugsPrescribed;
	}

	public void setDrugsPrescribed(Boolean drugsPrescribed) {
		this.drugsPrescribed = drugsPrescribed;
	}

	public String getDrugsPrescribedDetails() {
		return this.drugsPrescribedDetails;
	}

	public void setDrugsPrescribedDetails(String drugsPrescribedDetails) {
		this.drugsPrescribedDetails = drugsPrescribedDetails;
	}

	

	public Date getLastMenstruationDate() {
		return lastMenstruationDate;
	}

	public void setLastMenstruationDate(Date lastMenstruationDate) {
		this.lastMenstruationDate = lastMenstruationDate;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Boolean getMedicalProblem() {
		return this.medicalProblem;
	}

	public void setMedicalProblem(Boolean medicalProblem) {
		this.medicalProblem = medicalProblem;
	}

	public String getMedicalProblemDetails() {
		return this.medicalProblemDetails;
	}

	public void setMedicalProblemDetails(String medicalProblemDetails) {
		this.medicalProblemDetails = medicalProblemDetails;
	}

	public Integer getNoOfChildren() {
		return this.noOfChildren;
	}

	public void setNoOfChildren(Integer noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public Integer getNoOfMealsPerDay() {
		return this.noOfMealsPerDay;
	}

	public void setNoOfMealsPerDay(Integer noOfMealsPerDay) {
		this.noOfMealsPerDay = noOfMealsPerDay;
	}
    
	public void setNumberOfPregnancyMonths(BigDecimal numberOfPregnancyMonths) {
		this.numberOfPregnancyMonths = numberOfPregnancyMonths;
	}

	
	public Boolean getPregnantAtPresent() {
		return this.pregnantAtPresent;
	}

	public void setPregnantAtPresent(Boolean pregnantAtPresent) {
		this.pregnantAtPresent = pregnantAtPresent;
	}

	public String getPresentDietaryChoice() {
		return this.presentDietaryChoice;
	}

	public void setPresentDietaryChoice(String presentDietaryChoice) {
		this.presentDietaryChoice = presentDietaryChoice;
	}

	public Boolean getRegisteredForAnc() {
		return this.registeredForAnc;
	}

	public void setRegisteredForAnc(Boolean registeredForAnc) {
		this.registeredForAnc = registeredForAnc;
	}
	
	public Integer getRiskCategoryId() {
		return this.riskCategoryId;
	}

	public void setRiskCategoryId(Integer riskCategoryId) {
		this.riskCategoryId = riskCategoryId;
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

	public BigDecimal getNumberOfPregnancyMonths() {
		return numberOfPregnancyMonths;
	}

	

}