package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.resinet.hub_tdd.ScreenObject.Homeaction;
import br.com.resinet.hub_tdd.ScreenObject.Loginaction;
import br.com.resinet.hub_tdd.ScreenObject.Productaction;
import br.com.resinet.hub_tdd.ScreenObject.Registeraction;
import br.com.resinet.hub_tdd.Utils.Report;
import br.com.resinet.hub_tdd.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class TesteHome {

	public WebDriver driver;
	public Homeaction homeaction;
	public Loginaction logaction;
	public Registeraction registeraction;
	public Productaction prodaction;

	ExtentTest test = Report.getTest();
	ExtentReports extent = Report.getExtent();

	@BeforeClass
	public static void IniciaReport() {
		Report.iniciaReport();

	}

	@AfterClass
	public static void fechaReport() {
		Report.fechaReport();

	}

	@Before
	public void inicia() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.AbreStorage();
		logaction = new Loginaction(driver);
		homeaction = new Homeaction(driver);
		registeraction = new Registeraction(driver);
		prodaction = new Productaction(driver);
	}

	@After
	public void fechaDriver() {
		((AndroidDriver) driver).quit();
	}

	@Test
	public void testeCerto() throws InterruptedException, IOException {

		test = extent.startTest("Pesquisa Valida");

		homeaction.HeadPhoneClica();
		prodaction.clicaNoBeatsPhone();
		assertTrue(prodaction.NomeFone().getText().contains("BEATS"));

		String screenShotPath = Screenshot.capture(driver, "Teste na homa Valido");

		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
		test = extent.startTest("Registro válido");

	}

	@Ignore
	@Test
	public void testeerro() throws InterruptedException, MalformedURLException {

		test = extent.startTest("Pesquisa Invalida");

		homeaction.HeadPhoneClica();
		prodaction.clicaNoBeatsPhone();

	}

}
