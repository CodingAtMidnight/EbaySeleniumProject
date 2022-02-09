package com.neonsense.ebay_automation_project;


import org.junit.Test;



public class RegisterTestCases {
	
	
	@Test
	public void registerUser() throws InterruptedException {
		 AdvancedSearch advancedSearch = new AdvancedSearch();
		 advancedSearch.advancedSearchItemsInStores();
		 advancedSearch.advancedSearchFindStores();
	}

}
