package com.sophossolutions.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsDespegar {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

		
	public static void buscar(WebDriver driver, By barraOrigen, By barraDestino, String strOrigen, String strDestino, By seleccionar) {
		
		driver.findElement(barraOrigen).click();
		driver.findElement(barraOrigen).sendKeys(strOrigen);
		driver.findElement(seleccionar).click();
		
		driver.findElement(barraDestino).click();
		driver.findElement(barraDestino).sendKeys(strDestino);
		driver.findElement(seleccionar).click();

		
	}


	public static void fecha(WebDriver driver, By btnfechaIda, By btnfechaRegreso, By btnfechaInicial, By btnAplicar, By btnfechaVuelta) {
		
		
		driver.findElement(btnfechaIda).click();
		driver.findElement(btnfechaIda).click();
		driver.findElement(btnfechaInicial).click();
		driver.findElement(btnfechaVuelta).click();
		driver.findElement(btnAplicar).click();
		

	}
	public static void selecionarNiños(WebDriver driver, String strEdad, By btnOpciones, By btnMenores, By btnDesplegarOpciones, By btnOpcionesEdad, By btnAplicarTipo) {
		
		driver.findElement(btnOpciones).click();
		driver.findElement(btnOpciones).click();
		driver.findElement(btnMenores).click();
		
		WebElement niño=driver.findElement(btnDesplegarOpciones);
        List<WebElement> niños=niño.findElements(btnOpcionesEdad);
       
        for(WebElement option:niños) {
            if(strEdad.equals(option.getText())) {
                option.click();
                break;
            }
        }
        driver.findElement(btnAplicarTipo).click(); 
	}
	


	public static void selecionarClase(WebDriver driver, By btnOpciones, By btnSeleccionarClase, By btnMenuTipo, String strTipo, By btnAplicarTipo) {
		
		driver.findElement(btnOpciones).click();
		driver.findElement(btnOpciones).click();
		
		    WebElement clase=driver.findElement(btnMenuTipo);
	        List<WebElement> clases=clase.findElements(btnSeleccionarClase);
	       
	        for(WebElement option:clases) {
	            if(strTipo.equals(option.getText())) {
	                option.click();
	                break;
	            }
	        }
	        driver.findElement(btnAplicarTipo).click(); 
	    }


	public static void Buscar(WebDriver driver, By btnBuscarVuelo) {
		driver.findElement(btnBuscarVuelo).click(); 
       
	}

	public static void vuelosPorAerolinea(WebDriver driver, By barraOrigen, By strPrecios, By strAerolinea, By vueloEconimicoPrecio, By vueloEconimicoAerolinea, By vueloEconimicoPrecio2, By vueloEconimicoAerolinea2) {
			
		driver.findElement(barraOrigen).click();
		String aerolinia1 = driver.findElement(vueloEconimicoAerolinea).getText();
		String precio1 = driver.findElement(vueloEconimicoPrecio).getText();
		System.out.println("Aerolinea: " + aerolinia1);
		System.out.println("Precios: " + precio1);
		String aerolinia2 = driver.findElement(vueloEconimicoAerolinea2).getText();
		String precio2 = driver.findElement(vueloEconimicoPrecio2).getText();
	    System.out.println("Aerolinea: " + aerolinia2);
	    System.out.println("Precios: " + precio2);
	    /*
		  	
	    	String aerolinia = driver.findElement(strAerolinea).getText();
		    List<WebElement> clases=driver.findElements(strPrecios);
		    	    
		   // System.out.println("Aerolinea: " + aerolinia);
		    
		    for (WebElement model : clases) {
		    			    	  		
		    
	            System.out.println("Precios: " + model.getText()); 
	        }
		*/
			
		
	}	
}

