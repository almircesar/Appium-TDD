package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.resinet.hub_tdd.ScreenObject.Homeaction;
import br.com.resinet.hub_tdd.ScreenObject.Loginaction;
import br.com.resinet.hub_tdd.ScreenObject.Registeraction;
import br.com.resinet.hub_tdd.Utils.Report;
import br.com.resinet.hub_tdd.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastro {

	public static AndroidDriver driver;
	public Homeaction homeaction;
	public Loginaction logaction;
	public Registeraction registeraction;
	ExtentTest test = Report.getTest();
	ExtentReports extent = Report.getExtent();

	@Before
	public void inicia() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.AbreStorage();
		logaction = new Loginaction(driver);
		homeaction = new Homeaction(driver);
		registeraction = new Registeraction(driver);
	}
	
	@Test
	public void testes() throws InterruptedException, IOException {
		
		homeaction.clicaopcoes();
		homeaction.clicaLogin();
		logaction.clicaRegistrar();
		registeraction.escreveUser("Alan56");
		registeraction.escreverEmail("almiespp3@hotmail.com");
		registeraction.escrevePassword("WATATATa28");
		registeraction.escreveConfirmaPassword("WATATATa28");
		registeraction.escreveFirstName("Dani");
		registeraction.escreverLastName("Santos");
		registeraction.escrevePhoneNumber("1198377907");
		registeraction.rolartela();
		registeraction.clicaPais();
		registeraction.escolhePais();
		registeraction.EscreveEstado("Pernambuco");
		registeraction.EscreveEndereço("Rua Jarara");
		registeraction.EscreveCidade("Barueri");
		registeraction.EscreveCep("08669-265");
		registeraction.desabilitaCaixa();
		registeraction.Registrando();
		registeraction.waitAction();
		assertTrue(homeaction.HeadPhones2().getText().contains("HEADPHONE"));
		
		test = extent.startTest("Registro válido");
		
		String screenShotPath = Screenshot.capture(driver, "RegisterValid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
		
	}
	@Test
	public void testeserro() throws InterruptedException, IOException {
		
		homeaction.clicaopcoes();
		homeaction.clicaLogin();
		logaction.clicaRegistrar();
		registeraction.escreveUser("Almirz74");
		registeraction.escreverEmail("almirAAAaab@hotmailcom");
		registeraction.escrevePassword("1234567aB");
		registeraction.escreveConfirmaPassword("1234567aB");
		registeraction.escreveFirstName("Almir");
		registeraction.escreverLastName("Santos");
		registeraction.escrevePhoneNumber("11983772697");
		registeraction.rolartela();
		registeraction.clicaPais();
		registeraction.selecionaPais();
		registeraction.EscreveEstado("Sao Paulo");
		registeraction.EscreveEndereço("Rua Jarara133");
		registeraction.EscreveCidade("Barueri");
		registeraction.EscreveCep("08669-267778888888");
		registeraction.Registrando();
		assertFalse(registeraction.registerbtn().isEnabled());
		
		test = extent.startTest("Registro inválido");
		
		String screenShotPath = Screenshot.capture(driver, "RegisterValid");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

	@After
	public void fechaDriver() {
		((AndroidDriver) driver).quit();
	}

}