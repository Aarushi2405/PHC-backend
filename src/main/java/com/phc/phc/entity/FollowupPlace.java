package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the followup_place database table.
 * 
 */
@Entity
@Table(name="config.followup_place")
@NamedQuery(name="FollowupPlace.findAll", query="SELECT f FROM FollowupPlace f")
public class FollowupPlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="place_id")
	private int placeId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="place_name")
	private String placeName;

	public FollowupPlace() {
	}

	public int getPlaceId() {
		return this.placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
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

	public String getPlaceName() {
		return this.placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

}