package com.guacha.stepdefs;

import com.guacha.apis.GetAPI;

import io.cucumber.java.en.*;

public class GetApiStepDefinitions {

	GetAPI api;
	
	@Given("I want to test API {string}")
	public void iWantToTestAPI(String strBaseURL) {
	    api = new GetAPI(strBaseURL);
	}

	@When("Send user id {string} to GET endpoint {string}")
	public void sendUserToGETEndpoint(String strUserID, String strEndpointURL) {
	    api.executeGet(strEndpointURL, strUserID);
	}

	@Then("I should receive response code {int} and contains name {string} and last name {string}")
	public void iShouldReceiveResponseCodeAndContainsNameAndLastName(Integer intRespCode, String strName, String strLastName) {
	    assert api.validateField("data.first_name", strName);
	    assert api.validateField("data.last_name", strLastName);
	    
	}
	
}
