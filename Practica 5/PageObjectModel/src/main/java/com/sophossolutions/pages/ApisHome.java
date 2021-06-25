package com.sophossolutions.pages;

import java.util.Map;

import com.sophossolutions.actions.ActionsDespegar;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.pages.PageObject;

public class ApisHome extends PageObject{
	
	
	
	private static final String CONTENT_TYPE = "application/json";
	
	
	public void navegateTo(String strUrl) {
		ActionsDespegar.navegateToUrl(getDriver(), strUrl);
	}

	public void PostNoAuth(String endPoint, DataTable userInfo) {
		
					
		Map<String, String> body = userInfo.asMap(String.class, String.class);
		System.out.println("Aqui esta el Body " + body);
		System.out.println("Aqui esta el EnPoint " + endPoint);
		SerenityRest.
		when().get("https://reqres.in/api/users/2").
		then().assertThat().statusCode(200);
		
		SerenityRest.lastResponse().prettyPeek();
		

		SerenityRest.
		given().contentType(CONTENT_TYPE).
		when().body(body).post("https://reqres.in/api/register").
		then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
		
		

		
		
	}



}
