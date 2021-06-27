package com.sophossolutions.pages;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class Api
{
	private static final String CONTENT_TYPE = "application/json";
	private static final int status = 200;
	private static String url;
	private static String api;
	
	public static void navegarUrl(String url, String api)
	{
		Api.url = url;
		Api.api = api;
	}
	
	public static void probarPostGet(String endpoint, DataTable info)
	{
		Map<String, String> body = info.asMap(String.class,String.class);
		SerenityRest.when().get(url +  api).then().assertThat().statusCode(status);
		SerenityRest.lastResponse().prettyPeek();
		System.out.println("==============================================");
		System.out.println("ENPOINT: " + url + endpoint);
		System.out.println("============================================== \n");
		SerenityRest.given().contentType(CONTENT_TYPE).when().body(body).post(url.concat(endpoint));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void conprobarInformacion()
	{
		SerenityRest.lastResponse().prettyPeek();
		System.out.println("=============================================== \n [ \n");
		System.out.println("	id: " + SerenityRest.lastResponse().jsonPath().get("id").toString());
		System.out.println("	token: " + SerenityRest.lastResponse().jsonPath().get("token").toString()  + "\n]\n");
		System.out.println("===============================================");
	}
}