package com.sophossolutions.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class ComandosApi {
	
	private static final String CONTENT_TYPE="application/json";
	static String baseUrl;
	
	public static void ingresarUrl(String strUrl) {
		baseUrl=strUrl;
	}
	
	public static void ejecutarGet(String strUrl) {
		//GET
		SerenityRest.when().get(baseUrl.concat(strUrl))
		.then().assertThat().statusCode(200);
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void verificarRespuestaStatus(int intRes) {
		assertEquals(String.valueOf(intRes),String.valueOf(SerenityRest.lastResponse().statusCode()));
	}
	
	public static void verificarRespuestaIdYToken(int intId,String strToken) {
		int idPost=SerenityRest.lastResponse().jsonPath().get("id");
		System.out.println("Respuesta: id: "+idPost);
		assertTrue(intId==idPost);
		
		String tokenPost=SerenityRest.lastResponse().jsonPath().get("token");
		System.out.println("           token: "+tokenPost);
		assertEquals(strToken,tokenPost);
		
	}
	
	
	public static void ejecutarPost(String endPoint,DataTable userInfo) {
		Map<String,String> body=userInfo.asMap(String.class,String.class);
		//POST
		SerenityRest.given().contentType(CONTENT_TYPE)
		.when().body(body).post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	

}
