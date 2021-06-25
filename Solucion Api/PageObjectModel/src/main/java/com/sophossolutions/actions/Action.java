package com.sophossolutions.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void ingresarValor(WebDriver driver, By barrBusqueda, String strBusqueda) {
		driver.findElement(barrBusqueda).sendKeys(strBusqueda);
		
	}

	public static void darClick(WebDriver driver, By btnBoton) {
		driver.findElement(btnBoton).click();
		
	}
	public static void bajar(WebDriver driver,int pixeles) {
		String strScroll="scrollBy(0,%d)";		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(String.format(strScroll, pixeles));
		
	}
	
	public static void explicitWait(WebDriver driver,int tiempo) {
		driver.manage().timeouts().implicitlyWait(tiempo,TimeUnit.SECONDS) ;
	}
	
	public static void implicitWait(WebDriver driver,By element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
