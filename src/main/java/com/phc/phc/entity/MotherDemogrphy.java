package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the mother_demogrphy database table.
 * 
 */
@Entity
@Table(name="nr.mother_demogrphy")
@NamedQuery(name="MotherDemogrphy.findAll", query="SELECT m FROM MotherDemogrphy m")
public class MotherDemogrphy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mother_id")
	private int motherId;

	private int age;

	@Column(name="created_on")
	private Timestamp createdOn;
    
	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="education_qualification_id")
	private Integer educationQualificationId;
    
	@Column(name="family_planning")
	private Boolean familyPlanning;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	private String name;

	@Column(name="rch_id")
	private Long rchId;

	//bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy="motherDemogrphy")
	private List<CaseDetail> caseDetails;
	
	//bi-directional many-to-one association to ChildDemography
	@OneToMany(mappedBy="motherDemogrphy")
	private List<ChildDemography> childDemographies;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private NrcUser createdBy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="last_updated_by")
	private NrcUser lastUpdatedBy;

	public MotherDemogrphy() {
	}

	public int getMotherId() {
		return this.motherId;
	}

	public void setMotherId(int motherId) {
		this.motherId = motherId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getEducationQualificationId() {
		return this.educationQualificationId;
	}

	public void setEducationQualificationId(Integer educationQualificationId) {
		this.educationQualificationId = educationQualificationId;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRchId() {
		return this.rchId;
	}

	public void setRchId(Long rchId) {
		this.rchId = rchId;
	}

	public List<CaseDetail> getCaseDetails() {
		return this.caseDetails;
	}

	public void setCaseDetails(List<CaseDetail> caseDetails) {
		this.caseDetails = caseDetails;
	}

	public CaseDetail addCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().add(caseDetail);
		caseDetail.setMotherDemogrphy(this);

		return caseDetail;
	}

	public CaseDetail removeCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().remove(caseDetail);
		caseDetail.setMotherDemogrphy(null);

		return caseDetail;
	}
    
	public List<ChildDemography> getChildDemographies() {
		return this.childDemographies;
	}

	public void setChildDemographies(List<ChildDemography> childDemographies) {
		this.childDemographies = childDemographies;
	}

	public ChildDemography addChildDemography(ChildDemography childDemography) {
		getChildDemographies().add(childDemography);
		childDemography.setMotherDemogrphy(this);

		return childDemography;
	}

	public ChildDemography removeChildDemography(ChildDemography childDemography) {
		getChildDemographies().remove(childDemography);
		childDemography.setMotherDemogrphy(null);

		return childDemography;
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

	public Boolean getFamilyPlanning() {
		return familyPlanning;
	}

	public void setFamilyPlanning(Boolean familyPlanning) {
		this.familyPlanning = familyPlanning;
	}
    
	
}