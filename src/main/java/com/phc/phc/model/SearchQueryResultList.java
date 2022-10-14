package com.phc.phc.model;

import java.util.ArrayList;
import java.util.List;

public class SearchQueryResultList  implements AbstractModel{
	
	List<SearchQueryResponseModel> searchResultList = new ArrayList<>();

	public List<SearchQueryResponseModel> getSearchResultList() {
		return searchResultList;
	}

	public void setSearchResultList(List<SearchQueryResponseModel> searchResultList) {
		this.searchResultList = searchResultList;
	}
	
	

}
