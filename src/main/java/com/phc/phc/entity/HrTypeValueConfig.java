package com.phc.phc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the hr_type_value_config database table.
 * 
 */
@Entity
@Table(name="config.hr_type_value_config")
@NamedQuery(name="HrTypeValueConfig.findAll", query="SELECT h FROM HrTypeValueConfig h")
public class HrTypeValueConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hr_type_value_id")
	private int hrTypeValueId;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;

	@Column(name="value_type")
	private String valueType;

	//bi-directional many-to-one association to HrTypeConfig
	@OneToMany(mappedBy="hrTypeValueConfig")
	private List<HrTypeConfig> hrTypeConfigs;

	public HrTypeValueConfig() {
	}

	public int getHrTypeValueId() {
		return this.hrTypeValueId;
	}

	public void setHrTypeValueId(int hrTypeValueId) {
		this.hrTypeValueId = hrTypeValueId;
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

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public List<HrTypeConfig> getHrTypeConfigs() {
		return this.hrTypeConfigs;
	}

	public void setHrTypeConfigs(List<HrTypeConfig> hrTypeConfigs) {
		this.hrTypeConfigs = hrTypeConfigs;
	}

	public HrTypeConfig addHrTypeConfig(HrTypeConfig hrTypeConfig) {
		getHrTypeConfigs().add(hrTypeConfig);
		hrTypeConfig.setHrTypeValueConfig(this);

		return hrTypeConfig;
	}

	public HrTypeConfig removeHrTypeConfig(HrTypeConfig hrTypeConfig) {
		getHrTypeConfigs().remove(hrTypeConfig);
		hrTypeConfig.setHrTypeValueConfig(null);

		return hrTypeConfig;
	}

}