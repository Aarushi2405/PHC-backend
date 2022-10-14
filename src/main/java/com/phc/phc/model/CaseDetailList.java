package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class CaseDetailList  implements AbstractModel {
	
	List<CaseDetailModel> caseDetailList = new ArrayList<>();

	public List<CaseDetailModel> getCaseDetailList() {
		return caseDetailList;
	}

	public void setCaseDetailList(List<CaseDetailModel> caseDetailList) {
		this.caseDetailList = caseDetailList;
	}
	
	
	

}
