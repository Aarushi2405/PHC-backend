package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the hr_type_config database table.
 * 
 */
@Entity
@Table(name="config.hr_type_config")
@NamedQuery(name="HrTypeConfig.findAll", query="SELECT h FROM HrTypeConfig h")
public class HrTypeConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hr_type_id")
	private int hrTypeId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="hr_type")
	private String hrType;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	//bi-directional many-to-one association to HrTypeValueConfig
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hr_type_value_id")
	private HrTypeValueConfig hrTypeValueConfig;

	public HrTypeConfig() {
	}

	public int getHrTypeId() {
		return this.hrTypeId;
	}

	public void setHrTypeId(int hrTypeId) {
		this.hrTypeId = hrTypeId;
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

	public String getHrType() {
		return this.hrType;
	}

	public void setHrType(String hrType) {
		this.hrType = hrType;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public HrTypeValueConfig getHrTypeValueConfig() {
		return this.hrTypeValueConfig;
	}

	public void setHrTypeValueConfig(HrTypeValueConfig hrTypeValueConfig) {
		this.hrTypeValueConfig = hrTypeValueConfig;
	}

}