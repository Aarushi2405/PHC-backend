package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the outcome database table.
 * 
 */
@Entity
@Table(name="config.outcome")
@NamedQuery(name="Outcome.findAll", query="SELECT o FROM Outcome o")
public class Outcome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="outcome_id")
	private int outcomeId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	private String outcome;

	public Outcome() {
	}

	public int getOutcomeId() {
		return this.outcomeId;
	}

	public void setOutcomeId(int outcomeId) {
		this.outcomeId = outcomeId;
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

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

}