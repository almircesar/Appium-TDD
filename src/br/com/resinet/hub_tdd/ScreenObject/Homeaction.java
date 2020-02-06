package br.com.resinet.hub_tdd.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homeaction {

	public WebElement element;
	public WebDriver driver;
	

	public Homeaction(WebDriver driver) {
		this.driver = driver;
		
		
	}

	private WebElement botaoOpcoes() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]\r\n"));
	}

	private WebElement botaoLogin() {
		return driver.findElement(By.xpath(
				"//android.support.v4.widget.DrawerLayout[@content-desc=\"Main Menu\"]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"));
	}

	private WebElement HeadPhones() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView\r\n"));

	}
	public WebElement HeadPhones2() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView\r\n"));

	}
	
	private WebElement botaoPesquisa() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView\r\n"));	
	
}
	private WebElement TextoPesquisa() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\r\n"));
	
}

	
	public void PesquisaClica() {
		botaoPesquisa().click();

	}

	public void escrevePesquisa(String pesquisa) {
		TextoPesquisa().sendKeys(pesquisa);
	}
	
	public void HeadPhoneClica() {
		HeadPhones().click();

	}

	public void clicaopcoes() {
		botaoOpcoes().click();

	}

	public void clicaLogin() {
		botaoLogin().click();

	}

}