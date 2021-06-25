package com.sophossolutions.pages;


import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreCarrito extends PageObject{

	By btnCarrito = By.xpath("(//a[text()='Ver carrito'])[1]");
	
	public boolean SelecCarrito() {
		return Action.AgregarCarrito(getDriver());
	}
	
	public void cliccarrito() {
		Action.ClicCarrito(getDriver(),btnCarrito);
	}
}
