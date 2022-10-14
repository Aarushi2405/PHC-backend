package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ward database table.
 * 
 */
@Entity
@Table(name="config.ward")
@NamedQuery(name="Ward.findAll", query="SELECT w FROM Ward w")
public class Ward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ward_id")
	private int wardId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="h_id")
	private int hId;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	private String ward;

	public Ward() {
	}

	public int getWardId() {
		return this.wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
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

	public int getHId() {
		return this.hId;
	}

	public void setHId(int hId) {
		this.hId = hId;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getWard() {
		return this.ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

}