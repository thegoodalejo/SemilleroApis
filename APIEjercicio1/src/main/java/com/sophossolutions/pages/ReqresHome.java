package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class ReqresHome {
	
	public static final String CONTENT_TYPE = "application/json";
	public static String baseUrl;
	
	
	public static void setBaseUrl(String baseUrl) {
		ReqresHome.baseUrl = baseUrl;
	}
	
	
	public static void executPostNoRegister(String endPoint, DataTable userInfo) {
		//Tratamiento
		Map<String, String> body = userInfo.asMap(String.class, String.class);
		System.out.println(body);
		
		//GET
//		SerenityRest.
//		when().get().
//		then().assertThat().statusCode(400);
		
		//POST
		SerenityRest.
		given().contentType(CONTENT_TYPE).
		when().body(body).post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();				
	}
	
	public static void validateResponse(int status, String error) {
		SerenityRest.lastResponse().prettyPeek();
		
		int statusPost = SerenityRest.lastResponse().getStatusCode();
		System.out.println("Response.....Status Code:" + statusPost);		
		assertEquals(status, statusPost);
				
		
		String errorPost = SerenityRest.lastResponse().jsonPath().get("error");
		System.out.println("Response.....Error:" + errorPost);		
		assertEquals(error, errorPost);
	}

}
