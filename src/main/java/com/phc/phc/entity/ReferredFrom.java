package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the referred_from database table.
 * 
 */
@Entity
@Table(name="config.referred_from")
@NamedQuery(name="ReferredFrom.findAll", query="SELECT r FROM ReferredFrom r")
public class ReferredFrom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="referred_from_id")
	private int referredFromId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="referred_from")
	private String referredFrom;

	public ReferredFrom() {
	}

	public int getReferredFromId() {
		return this.referredFromId;
	}

	public void setReferredFromId(int referredFromId) {
		this.referredFromId = referredFromId;
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

	public String getReferredFrom() {
		return this.referredFrom;
	}

	public void setReferredFrom(String referredFrom) {
		this.referredFrom = referredFrom;
	}

}