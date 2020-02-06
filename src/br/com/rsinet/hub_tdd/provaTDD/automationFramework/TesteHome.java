package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.resinet.hub_tdd.ScreenObject.Homeaction;
import br.com.resinet.hub_tdd.ScreenObject.Loginaction;
import br.com.resinet.hub_tdd.ScreenObject.Productaction;
import br.com.resinet.hub_tdd.ScreenObject.Registeraction;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverFactory;

public class TesteHome {

	public WebDriver driver;
	public Homeaction homeaction;
	public Loginaction logaction;
	public Registeraction registeraction;
	public Productaction prodaction;

	@Before
	public void inicia() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.AbreStorage();
		logaction = new Loginaction(driver);
		homeaction = new Homeaction(driver);
		registeraction = new Registeraction(driver);
		prodaction = new Productaction(driver);
	}

	@Test
	public void testes() throws InterruptedException, MalformedURLException {
		homeaction.HeadPhoneClica();
		prodaction.clicaNoBeatsPhone();
		
	}
}
