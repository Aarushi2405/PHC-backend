package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wfl_ref_from_nrc database table.
 * 
 */
@Entity
@Table(name="config.wfl_ref_from_nrc")
@NamedQuery(name="WflRefFromNrc.findAll", query="SELECT w FROM WflRefFromNrc w")
public class WflRefFromNrc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	private String gender;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="length_cm")
	private BigDecimal lengthCm;

	private BigDecimal median;

	@Column(name="minus_1_sd")
	private BigDecimal minus1Sd;

	@Column(name="minus_2_sd")
	private BigDecimal minus2Sd;

	@Column(name="minus_3_sd")
	private BigDecimal minus3Sd;

	@Column(name="minus_4_sd")
	private BigDecimal minus4Sd;

	public WflRefFromNrc() {
	}

	public int getRecId() {
		return this.recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
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

	public BigDecimal getLengthCm() {
		return this.lengthCm;
	}

	public void setLengthCm(BigDecimal lengthCm) {
		this.lengthCm = lengthCm;
	}

	public BigDecimal getMedian() {
		return this.median;
	}

	public void setMedian(BigDecimal median) {
		this.median = median;
	}

	public BigDecimal getMinus1Sd() {
		return this.minus1Sd;
	}

	public void setMinus1Sd(BigDecimal minus1Sd) {
		this.minus1Sd = minus1Sd;
	}

	public BigDecimal getMinus2Sd() {
		return this.minus2Sd;
	}

	public void setMinus2Sd(BigDecimal minus2Sd) {
		this.minus2Sd = minus2Sd;
	}

	public BigDecimal getMinus3Sd() {
		return this.minus3Sd;
	}

	public void setMinus3Sd(BigDecimal minus3Sd) {
		this.minus3Sd = minus3Sd;
	}

	public BigDecimal getMinus4Sd() {
		return this.minus4Sd;
	}

	public void setMinus4Sd(BigDecimal minus4Sd) {
		this.minus4Sd = minus4Sd;
	}

}