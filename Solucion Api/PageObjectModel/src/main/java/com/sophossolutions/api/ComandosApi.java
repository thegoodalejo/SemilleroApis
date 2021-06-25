package com.sophossolutions.api;

import net.serenitybdd.rest.SerenityRest;

public class ComandosApi {
	
	private static final String CONTENT_TYPE="application/json";
	String baseUrl="https://reqres.in/";
	
	public static void ejecutarGet() {
		//GET
		SerenityRest.when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	//public static void ejecutarPost(String endPoint,DataTable userInfo) {
		//Map<String,String> body=userInfo.asMap(String.class,String.class)
		//POST
		//SerenityRest.given().contentType(CONTENT_TYPE)
		//.when().body(null).post(baseUrl.concat(endPoint));
	//}
	
	

}
