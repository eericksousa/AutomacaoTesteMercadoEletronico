package br.com.teste.mercadoeletronico.logics;

import org.junit.Assert;

import br.com.teste.mercadoeletronico.config.Driver;
import br.com.teste.mercadoeletronico.config.Utils;
import br.com.teste.mercadoeletronico.pages.HomePagePage;

public class LoginLogic extends Utils {

	HomePagePage hpPage = new HomePagePage();
	
	public void siteTeste(String url) {
		Driver.setUrl(url);
	}
	
	public void validaPaginaInicial() {
		Assert.assertEquals("My Store", hpPage.getHomePage());
	}
	
}