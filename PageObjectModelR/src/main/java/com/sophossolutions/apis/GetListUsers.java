package com.sophossolutions.apis;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.rest.SerenityRest;

public class GetListUsers {
	
	private static String baseUrl;	
	private static final String CONTENT_TYPE = "application/json";
	
	public static void setBaseUrl(String strBaseUrl) {
		GetListUsers.baseUrl = strBaseUrl;
	}

	public static void executeGetListUsers(String strEndPoint) {
		SerenityRest.when().get(baseUrl.concat(strEndPoint)).then().assertThat().statusCode(200);
	}
	
	public static void validateResponsive(Integer intStatusCode, String strTotal) {
		System.out.println("Estado respuesta..... " +  String.valueOf(SerenityRest.lastResponse().getStatusCode()));
		assertEquals(String.valueOf(intStatusCode), String.valueOf(SerenityRest.lastResponse().getStatusCode()));
		String cantidadPost = "" + SerenityRest.lastResponse().jsonPath().get("total");
		System.out.println("Cantidad respuesta... " + cantidadPost);
		assertEquals(strTotal, cantidadPost);
	}
}
