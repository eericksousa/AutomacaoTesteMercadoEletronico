package br.com.teste.mercadoeletronico.pages;

import org.openqa.selenium.By;

public class HomePagePage {
	
	private By logoHomePage = By.xpath("//*[@id='header_logo']");
	
	public By getHomePage() {
		return logoHomePage;
	}

}
