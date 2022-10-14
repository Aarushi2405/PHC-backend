package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wfl_ref_from_who database table.
 * 
 */
@Entity
@Table(name="config.wfl_ref_from_who")
@NamedQuery(name="WflRefFromWho.findAll", query="SELECT w FROM WflRefFromWho w")
public class WflRefFromWho implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rec_id")
	private int recId;

	private String gender;

	private String l;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="length_cm")
	private BigDecimal lengthCm;

	private String m;

	private BigDecimal median;

	@Column(name="minus_1_sd")
	private BigDecimal minus1Sd;

	@Column(name="minus_2_sd")
	private BigDecimal minus2Sd;

	@Column(name="minus_3_sd")
	private BigDecimal minus3Sd;

	@Column(name="plus_1_sd")
	private BigDecimal plus1Sd;

	@Column(name="plus_2_sd")
	private BigDecimal plus2Sd;

	@Column(name="plus_3_sd")
	private BigDecimal plus3Sd;

	private String s;

	public WflRefFromWho() {
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

	public String getL() {
		return this.l;
	}

	public void setL(String l) {
		this.l = l;
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

	public String getM() {
		return this.m;
	}

	public void setM(String m) {
		this.m = m;
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

	public BigDecimal getPlus1Sd() {
		return this.plus1Sd;
	}

	public void setPlus1Sd(BigDecimal plus1Sd) {
		this.plus1Sd = plus1Sd;
	}

	public BigDecimal getPlus2Sd() {
		return this.plus2Sd;
	}

	public void setPlus2Sd(BigDecimal plus2Sd) {
		this.plus2Sd = plus2Sd;
	}

	public BigDecimal getPlus3Sd() {
		return this.plus3Sd;
	}

	public void setPlus3Sd(BigDecimal plus3Sd) {
		this.plus3Sd = plus3Sd;
	}

	public String getS() {
		return this.s;
	}

	public void setS(String s) {
		this.s = s;
	}

}