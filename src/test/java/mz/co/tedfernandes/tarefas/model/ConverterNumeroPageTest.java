package mz.co.tedfernandes.tarefas.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConverterNumeroPageTest {

	private WebDriver driver;
	private WebElement numeroRomano;
	
	@Before
	public void inicializacao(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("http://localhost:8080/revisao-javaweb/romanoToDecimal");
		this.numeroRomano = driver.findElement(By.name("numeroRomano"));
	}
	
	@After
	public void finalizacao(){
		this.driver.close();
	}
	
}
