package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the district database table.
 * 
 */
@Entity
@Table(name="config.district")
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="district_id")
	private int districtId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	public District() {
	}

	public int getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}