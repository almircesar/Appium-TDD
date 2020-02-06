package br.com.resinet.hub_tdd.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginaction {
	public WebElement element;
	public WebDriver driver;

	public Loginaction(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement botaoRegistrar() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout\r\n"));
	}

	public void clicaRegistrar() {
		botaoRegistrar().click();

	}

}
