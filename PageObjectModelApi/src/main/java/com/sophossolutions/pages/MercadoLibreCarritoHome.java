package com.sophossolutions.pages;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreCarritoHome extends PageObject{


	
	public void VerificarDatos() {
		 Action.VerificarDatoscarrito(getDriver());
	}
}
