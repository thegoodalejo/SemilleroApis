package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.mercadolibre.com.co")
public class MercadoLibreHome extends PageObject {

	By TxBoxProduc = By.xpath("//input[@placeholder='Buscar productos, marcas y más…']");
	By btnBuscar = By.xpath("//div[@aria-label='Buscar']");

	public void AgregarACarrito(String Nproc) {
		Action.IngresarProBus(getDriver(), TxBoxProduc, btnBuscar, Nproc);
	}

}
