package br.com.resinet.hub_tdd.ScreenObject;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Registeraction {
	public WebElement element;
	public WebDriver driver;
	public TouchAction toque;
	public AndroidDriver<WebElement> driverAndroid;

	public Registeraction(WebDriver driver) {
		this.driver = driver;
		toque = new TouchAction((PerformsTouchActions) driver);
	}

	private WebElement UserName() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement Email() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement Password() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement ConfirmPassword() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement FirtName() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"));
	}

	private WebElement LastName() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"));
	}

	private WebElement PhoneNumber() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement State() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));

	}

	private WebElement Adress() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	private WebElement City() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
	}

	private WebElement Zip() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"));
	}

	private WebElement Country() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout\r\n"));

	}

	private List<WebElement> selecionaPais1() {
		return driver.findElements(By.className("android.widget.TextView"));
	}

	public WebElement registerbtn() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\r\n"));
	}

	private WebElement desabilita() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox[1]\r\n"));

	}

	public void desabilitaCaixa() {
		desabilita().click();
	}

	public void escreveUser(String username) {
		UserName().sendKeys(username);

	}

	public void escreverEmail(String email) {
		Email().sendKeys(email);

	}

	public void escrevePassword(String password) {
		Password().sendKeys(password);

	}

	public void escreveConfirmaPassword(String ConfirmPass) {
		ConfirmPassword().sendKeys(ConfirmPass);

	}

	public void escreveFirstName(String FirstName) {
		FirtName().sendKeys(FirstName);

	}

	public void escreverLastName(String LastName) {
		LastName().sendKeys(LastName);
	}

	public void escrevePhoneNumber(String PhoneNumber) {
		PhoneNumber().sendKeys(PhoneNumber);
	}

	public void rolartela() throws MalformedURLException, InterruptedException {
		toque.press(PointOption.point(458, 1353)).moveTo(PointOption.point(542, 412)).release().perform();
	}

	public void rolartelaPais() throws MalformedURLException, InterruptedException {
		toque.press(PointOption.point(668, 1952)).moveTo(PointOption.point(684, 788)).release().perform();
	}

	public void EscreveEstado(String State) {
		State().sendKeys(State);
	}

	public void EscreveEndereço(String Adress) {
		Adress().sendKeys(Adress);
	}

	public void EscreveCidade(String City) {
		City().sendKeys(City);
	}

	public void EscreveCep(String Cep) {
		Zip().sendKeys(Cep);
	}

	public void clicaPais() {
		Country().click();
	}
	public void escolhePais() {
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();
	}

	public void selecionaPais() throws InterruptedException {
		selecionaPais1().get(16).click();
	}

	public void Registrando() {
		registerbtn().click();
	}

	public void waitAction() {
		toque.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
	}
}
