package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the social_factors database table.
 * 
 */
@Entity
@Table(name="config.social_factors")
@NamedQuery(name="SocialFactor.findAll", query="SELECT s FROM SocialFactor s")
public class SocialFactor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="social_factors_id")
	private int socialFactorsId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="social_factors")
	private String socialFactors;

	public SocialFactor() {
	}

	public int getSocialFactorsId() {
		return this.socialFactorsId;
	}

	public void setSocialFactorsId(int socialFactorsId) {
		this.socialFactorsId = socialFactorsId;
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

	public String getSocialFactors() {
		return this.socialFactors;
	}

	public void setSocialFactors(String socialFactors) {
		this.socialFactors = socialFactors;
	}

}