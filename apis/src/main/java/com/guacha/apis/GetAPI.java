package com.guacha.apis;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class GetAPI {

	public final String BASE_URL;
	public Response lastResponse;
	
	public GetAPI(String base) {
		this.BASE_URL = base;
	}
	
	public void executeGet(String apiURL, String param) {
		
		System.out.println(this.BASE_URL + apiURL + param);
		this.lastResponse = SerenityRest.when().get(this.BASE_URL + apiURL + param);
		
	}
	
	public boolean validateField(String fieldRoute, String expectedValue) {
		String actualValue = this.lastResponse.body().jsonPath().get(fieldRoute);
		return actualValue.equals(expectedValue);
	}
	
}
