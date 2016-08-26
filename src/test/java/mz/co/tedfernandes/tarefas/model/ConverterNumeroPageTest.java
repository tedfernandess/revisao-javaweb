package mz.co.tedfernandes.tarefas.model;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConverterNumeroPageTest {

	@Test
	public void deveConverterNumeroDentroDosLimitesEstabelecidos(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/revisao-javaweb/romanoToDecimal");
		
		WebElement numeroRomano = driver.findElement(By.name("numeroRomano"));
		
		numeroRomano.sendKeys("XIX");
		numeroRomano.submit();
		
		boolean achouTexto = driver.getPageSource().contains("19");
		
		Assert.assertTrue(achouTexto);
		
		driver.close();
		
	}
	
}
