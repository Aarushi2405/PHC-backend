package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the child_demography database table.
 * 
 */
@Entity
@Table(name="nr.child_demography")
@NamedQuery(name="ChildDemography.findAll", query="SELECT c FROM ChildDemography c")
public class ChildDemography implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="child_id")
	private int childId;

	@Column(name="address_line1")
	private String addressLine1;

	@Column(name="address_line2")
	private String addressLine2;

	@Column(name="address_line3")
	private String addressLine3;
	
	@Column(name="district_id")
	private Integer districtId;
	
	private Integer pincode;
    
	@Column(name="age_in_months")
	private int ageInMonths;

	@Column(name="caste_id")
	private Integer casteId;

	private String category;

	@Column(name="created_on")
	private Timestamp createdOn;

	
	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	private String gender;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="alternate_mobile_number")
	private String alternateContactNumber;

	private String name;

	@Column(name="rch_id")
	private Long rchId;

	@Column(name="religon_id")
	private Integer religonId;
	
	@Column(name="has_guardian")
	private Boolean hasGuardian;
	
	@Column(name="guardian_name")
	private String guardianName;

	//bi-directional many-to-one association to CaseDetail
	@OneToMany(mappedBy="childDemography")
	private List<CaseDetail> caseDetails;
	
	//bi-directional many-to-one association to MotherDemogrphy
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mother_id")
	private MotherDemogrphy motherDemogrphy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="created_by")
	private NrcUser createdBy;

	//bi-directional many-to-one association to NrcUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="last_updated_by")
	private NrcUser lastUpdatedBy;

	public ChildDemography() {
	}

	public int getChildId() {
		return this.childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public Integer getCasteId() {
		return casteId;
	}

	public void setCasteId(Integer casteId) {
		this.casteId = casteId;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	

	public Integer getReligonId() {
		return religonId;
	}

	public void setReligonId(Integer religonId) {
		this.religonId = religonId;
	}

	public List<CaseDetail> getCaseDetails() {
		return this.caseDetails;
	}

	public void setCaseDetails(List<CaseDetail> caseDetails) {
		this.caseDetails = caseDetails;
	}

	public CaseDetail addCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().add(caseDetail);
		caseDetail.setChildDemography(this);

		return caseDetail;
	}

	public CaseDetail removeCaseDetail(CaseDetail caseDetail) {
		getCaseDetails().remove(caseDetail);
		caseDetail.setChildDemography(null);

		return caseDetail;
	}
    
	
	public MotherDemogrphy getMotherDemogrphy() {
		return this.motherDemogrphy;
	}

	public void setMotherDemogrphy(MotherDemogrphy motherDemogrphy) {
		this.motherDemogrphy = motherDemogrphy;
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public Boolean getHasGuardian() {
		return hasGuardian;
	}

	public void setHasGuardian(Boolean hasGuardian) {
		this.hasGuardian = hasGuardian;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

}