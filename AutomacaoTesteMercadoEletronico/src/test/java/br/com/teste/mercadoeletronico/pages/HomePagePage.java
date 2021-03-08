package br.com.teste.mercadoeletronico.pages;

import org.openqa.selenium.By;

public class HomePagePage {
	
	public By logoHomePage = By.xpath("//*[@id='header_logo']/a");
	
	public By getHomePage() {
		return logoHomePage;
	}

}
