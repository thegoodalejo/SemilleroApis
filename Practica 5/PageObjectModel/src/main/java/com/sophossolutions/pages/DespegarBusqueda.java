package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.ActionsDespegar;

import net.thucydides.core.pages.PageObject;

public class DespegarBusqueda extends PageObject {
	By barraOrigen= By.xpath("//toolbox-tabs/div/tabs/div/div[1]/div/ul/li[1]");
	By strPrecios= By.xpath("//span[@class=\"pricebox-big-text price\"]");
	By strAerolinea= By.xpath("//*[@id='clusters']/span[1]/div/span/cluster/div/div/div[1]/div/span/div/div[2]/span[1]/route-choice/ul/li/route/itinerary/div/div/div[1]/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span/span[2]/span");
	By vueloEconimicoPrecio= By.xpath("//*[@id=\"toolbox-tabs-position\"]/toolbox-tabs/div/tabs/div/div[2]/tab/div/airlines-matrix/span/div/div/div/div/airlines-matrix-airline[1]/ul/li[2]/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	By vueloEconimicoAerolinea= By.xpath("//*[@id=\"toolbox-tabs-position\"]/toolbox-tabs/div/tabs/div/div[2]/tab/div/airlines-matrix/span/div/div/div/div/airlines-matrix-airline[1]/ul/li[1]/div/div/div[2]/span");
	By vueloEconimicoAerolinea2= By.xpath("//*[@id=\"toolbox-tabs-position\"]/toolbox-tabs/div/tabs/div/div[2]/tab/div/airlines-matrix/span/div/div/div/div/airlines-matrix-airline[2]/ul/li[1]/div/div/div[2]/span");
	By vueloEconimicoPrecio2= By.xpath("//*[@id=\"toolbox-tabs-position\"]/toolbox-tabs/div/tabs/div/div[2]/tab/div/airlines-matrix/span/div/div/div/div/airlines-matrix-airline[2]/ul/li[2]/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	
	public void vuelosEconomicos() {
		ActionsDespegar.vuelosPorAerolinea(getDriver(), barraOrigen, strPrecios, strAerolinea, vueloEconimicoPrecio,vueloEconimicoAerolinea,vueloEconimicoPrecio2,vueloEconimicoAerolinea2);
	}

}
