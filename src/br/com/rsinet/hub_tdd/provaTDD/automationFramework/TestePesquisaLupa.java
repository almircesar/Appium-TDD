package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.resinet.hub_tdd.ScreenObject.Homeaction;
import br.com.resinet.hub_tdd.ScreenObject.Productaction;
import br.com.resinet.hub_tdd.ScreenObject.Registeraction;
import br.com.resinet.hub_tdd.Utils.Report;
import br.com.resinet.hub_tdd.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaLupa {
	public static AndroidDriver driver;
	public Homeaction homeaction;

	public Registeraction registeraction;
	public Productaction prodaction;

	@BeforeClass
	public static void IniciaReport() {
		Report.iniciaReport();

	}

	@AfterClass
	public static void fechaReport() {
		Report.fechaReport();

	}

	ExtentTest test = Report.getTest();
	ExtentReports extent = Report.getExtent();

	@Before
	public void inicia() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.AbreStorage();
		homeaction = new Homeaction(driver);
		registeraction = new Registeraction(driver);
		prodaction = new Productaction(driver);
	}

	@After
	public void fechaDriver() {
		((AndroidDriver) driver).quit();
	}

	@Test
	public void testecerto() throws InterruptedException, IOException {

		test = extent.startTest("Registro válido");

		homeaction.PesquisaClica();
		homeaction.escrevePesquisa("HeadPhone");
		homeaction.PesquisaClica();
		prodaction.clicaPhone();
		assertTrue(prodaction.assertPhone().getText().contains("MATTE"));

		String screenShotPath = Screenshot.capture(driver, "Pesquisa na lupa  valida");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

	@Test
	public void testeerro() throws InterruptedException, IOException {

		test = extent.startTest("Registro inválido");

		homeaction.PesquisaClica();
		homeaction.escrevePesquisa("Mousepad");
		homeaction.PesquisaClica();
		Thread.sleep(2000);
		assertTrue(prodaction.assertPhoneErro().getText().contains("for"));

		String screenShotPath = Screenshot.capture(driver, "Pesquisa na lupa invalida");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

}
