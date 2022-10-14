package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class WeightPerLengthList implements AbstractModel {
	List<WeightPerLengthReferenceModel> wtPerLenRefLst = new ArrayList<WeightPerLengthReferenceModel>();

	public List<WeightPerLengthReferenceModel> getWtPerLenRefLst() {
		return wtPerLenRefLst;
	}

	public void setWtPerLenRefLst(List<WeightPerLengthReferenceModel> wtPerLenRefLst) {
		this.wtPerLenRefLst = wtPerLenRefLst;
	}
}
