package br.com.resinet.hub_tdd.ScreenObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class Productaction {
	public WebElement element;
	public WebDriver driver;
	public AndroidDriver<WebElement> AndDriver;
//	public WebDriverWait wait = new WebDriverWait(driver, 10);

	public Productaction(WebDriver driver) {
		this.driver = driver;
		
	}

	private WebElement BeatsHeadPhone() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]\r\n"));

	}

	public WebElement ElementoCerto() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]\r\n"));

	}

	public WebElement assertPhone() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName"));

	}

	public WebElement assertPhoneErro() {
		return driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.TextView"));
		
}
	public WebElement NomeFone() {
			return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName"));
}

	public void clicaPhone() {
		ElementoCerto().click();

	}

	public void clicaNoBeatsPhone() {
		BeatsHeadPhone().click();

	}
}
