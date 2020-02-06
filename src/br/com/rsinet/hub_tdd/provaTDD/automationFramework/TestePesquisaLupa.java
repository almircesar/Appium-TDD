package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.resinet.hub_tdd.ScreenObject.Homeaction;
import br.com.resinet.hub_tdd.ScreenObject.Productaction;
import br.com.resinet.hub_tdd.ScreenObject.Registeraction;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaLupa {
	public static AndroidDriver driver;
	public Homeaction homeaction;

	public Registeraction registeraction;
	public Productaction prodaction;

	@Before
	public void inicia() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.AbreStorage();
		homeaction = new Homeaction(driver);
		registeraction = new Registeraction(driver);
		prodaction = new Productaction(driver);
	}

	@Test
	public void testecerto() throws InterruptedException, MalformedURLException {

		homeaction.PesquisaClica();
		homeaction.escrevePesquisa("HeadPhone");
		homeaction.PesquisaClica();
		prodaction.clicaPhone();
		assertTrue(prodaction.assertPhone().getText().contains("MATTE"));

	}
	
	@Test
	public void testeerro() throws InterruptedException, MalformedURLException {

		homeaction.PesquisaClica();
		homeaction.escrevePesquisa("Mousepad");
		homeaction.PesquisaClica();
		Thread.sleep(2000);
		assertTrue(prodaction.assertPhoneErro().getText().contains("for"));
	}

	@After
	public void fechaDriver() {
		((AndroidDriver) driver).quit();
	}
}
