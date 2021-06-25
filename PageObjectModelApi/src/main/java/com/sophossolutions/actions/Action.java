package com.sophossolutions.actions;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {


	public static void IngresarProBus(WebDriver myBrowser, By texto, By btn, String Np) {
		myBrowser.findElement(texto).click();
		myBrowser.findElement(texto).sendKeys(Np);
		myBrowser.findElement(btn).click();

	}

	public static void SelecProCarrito(WebDriver myBrowser, By nomb) {
		scrollDown(myBrowser);
		myBrowser.findElement(nomb).click();
		

	}

	public static boolean AgregarCarrito(WebDriver myBrowser) {
		JavascriptExecutor js = (JavascriptExecutor) myBrowser;
		for (int i = 10; i <= 100; i += 6) {
			js.executeScript("window.scrollTo(0,500)");
		}
			
		WebElement sel = myBrowser.findElement(By.xpath("//div[@class='ui-pdp-container ui-pdp-container--pdp']"));
		List<WebElement> h3 = sel.findElements(By.xpath("//span[@class='andes-button__content' and text()='Agregar al carrito']"));
		if(h3.size() > 0) {
			String title = "(//div[@class='ui-pdp-container ui-pdp-container--pdp']//span[@class='andes-button__content' and text()='Agregar al carrito'])[%s]";
			By btnAgregarCarrito = By.xpath(String.format(title, String.valueOf(h3.size())));
			myBrowser.findElement(btnAgregarCarrito).click();
			return true;
		}else{
			return false;
		}
		
		
	
	}
	public static void VerificarDatoscarrito(WebDriver myBrowser) {
		
		WebElement sel = myBrowser.findElement(By.xpath("//div[@data-region='items']"));
		List<WebElement> h3 = sel.findElements(By.xpath("//a[@class='item__title--link']"));
		
		for (WebElement productos : h3) {
			
			System.out.println(productos.getText());
			System.out.println("-------------------------");
		}
		
	}
	public static void scrollDown(WebDriver myBrowser) {
        JavascriptExecutor js = (JavascriptExecutor) myBrowser;
        for (int i = 10; i <= 100; i+=10)
        js.executeScript("window.scrollTo("+ (i-10)/100.0 + "*document.body.scrollHeight,"
                + i/100.0 + "*document.body.scrollHeight) ");
    }

	public static void ClicCarrito(WebDriver myBrowser, By btnCarrito) {
		
		myBrowser.findElement(btnCarrito).click();
	}


}
