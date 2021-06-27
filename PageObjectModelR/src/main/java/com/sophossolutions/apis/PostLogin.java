package com.sophossolutions.apis;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class PostLogin {

	private static String baseUrl;	
	private static final String CONTENT_TYPE = "application/json";
	
	public static void setBaseUrl(String baseUrl) {
		PostLogin.baseUrl = baseUrl;
	}

	public static void executePostLogin(String strEndPoint, DataTable dataUserInfo) {
		Map<String, String> body= dataUserInfo.asMap(String.class, String.class);
		System.out.println("Body: " + body);
		SerenityRest.given().contentType(CONTENT_TYPE).when().body(body).post(baseUrl.concat(strEndPoint));
		

	}

	public static void validateResponsive(Integer intStatusCode, String strToken) {
		System.out.println("Estado respuesta... "+  String.valueOf(SerenityRest.lastResponse().getStatusCode()));
		assertEquals(String.valueOf(intStatusCode), String.valueOf(SerenityRest.lastResponse().getStatusCode()));
		String tokenPost = SerenityRest.lastResponse().jsonPath().get("token");
		System.out.println("Token respuesta.... " + tokenPost);
		assertEquals(strToken, tokenPost);
	}

}
