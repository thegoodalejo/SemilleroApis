package com.sophossolutions.apis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class PostNoAuth {
	private static final String CONTENT_TYPE = "application/json";
	private static String url;

	public static void setBaseUrl(String url) {
		PostNoAuth.url = url;				
	}

	public static void executePostNoAuth(String endPoint, DataTable userInfo) {
		Map<String, String> body = userInfo.asMap(String.class, String.class);	
		System.out.println(body);
		//GET
		SerenityRest.when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
		
		//POST
		SerenityRest.given().contentType(CONTENT_TYPE).when().body(body).post(url.concat(endPoint));
		SerenityRest.lastResponse().prettyPeek();
	}

	public static void validateResponse(Integer statusCode, Integer id, String token) {
		System.out.println("Response");
		SerenityRest.lastResponse().prettyPeek();
		//assertEquals(String.valueOf(statusCode), String.valueOf(SerenityRest.lastResponse()));
		Integer idPost = SerenityRest.lastResponse().jsonPath().get("id");
		System.out.println("Response . "+idPost);
		assertTrue(id == idPost);
		System.out.println("Response ..");
		String tokenPost = SerenityRest.lastResponse().jsonPath().get("token");
		System.out.println("Response ... "+tokenPost);
		assertEquals(token, tokenPost);
	}
	
	
	
}
