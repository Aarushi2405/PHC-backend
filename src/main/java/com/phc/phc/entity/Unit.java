package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the unit database table.
 * 
 */
@Entity
@Table(name="config.unit")
@NamedQuery(name="Unit.findAll", query="SELECT u FROM Unit u")
public class Unit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="unit_id")
	private int unitId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="h_id")
	private int hId;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	private String unit;

	public Unit() {
	}

	public int getUnitId() {
		return this.unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}