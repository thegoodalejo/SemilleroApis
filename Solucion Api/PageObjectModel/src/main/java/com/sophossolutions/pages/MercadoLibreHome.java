package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreHome extends PageObject{
	
	By barrBusqueda=By.xpath("//input[@aria-label='Ingresa lo que quieras encontrar']");
	By btnBusqueda=By.xpath("//button[@tabindex='3']");
	
	
	//1. Navegar por la url
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	//2. Ingresar Busqueda
	public void ingresarBusqueda(String strBusqueda) {
		Action.ingresarValor(getDriver(),barrBusqueda,strBusqueda);
		Action.darClick(getDriver(),btnBusqueda);
		Action.explicitWait(getDriver(),1);
	}
}
