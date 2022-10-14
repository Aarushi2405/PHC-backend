package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class ExcelReportList implements AbstractModel {
	private String monthName;
	private Integer yearValue;
	private String nrcType;
	
	List<ExcelReportModel> excelreports = new ArrayList<ExcelReportModel>();

	public List<ExcelReportModel> getExcelreports() {
		return excelreports;
	}

	public void setExcelreports(List<ExcelReportModel> excelreports) {
		this.excelreports = excelreports;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public Integer getYearValue() {
		return yearValue;
	}

	public void setYearValue(Integer yearValue) {
		this.yearValue = yearValue;
	}

	public String getNrcType() {
		return nrcType;
	}

	public void setNrcType(String nrcType) {
		this.nrcType = nrcType;
	}
	
	
	
	
}
