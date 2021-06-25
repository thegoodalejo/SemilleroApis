package com.sophossolutions.apis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;
import java.util.Map;

public class Api {
	
	private static final String CONTENT_TYPE = "application/json";
	private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		Api.baseUrl = baseUrl;
	}
	
	public static void ejecutarPost(String endPoint, DataTable infoUser) {
		
		//Mapeo tabla
		Map<String, String> body = infoUser.asMap(String.class, String.class);
		
		SerenityRest.when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
		SerenityRest.given().contentType(CONTENT_TYPE).when().body(body).post(baseUrl.concat(endPoint));
		SerenityRest.lastResponse().prettyPeek();
	
	}
}
