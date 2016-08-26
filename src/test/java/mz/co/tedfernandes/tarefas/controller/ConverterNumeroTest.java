package mz.co.tedfernandes.tarefas.controller;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import mz.co.tedfernandes.tarefas.model.ConverteNumero;

public class ConverterNumeroTest {

	@Test
	public void deveConverterNumeroRomanoComUmCaraterValido(){
		ConverteNumero converteNumero = new ConverteNumero();
		String letra="M";
		Assert.assertEquals(1000, converteNumero.executaOperacao(letra));
	}
	
	@Test
	public void naoDeveConverterNumeroRomanoComUmCaraterInvalido(){
		ConverteNumero converteNumero = new ConverteNumero();
		String letra="A";
		Assert.assertEquals(0, converteNumero.executaOperacao(letra));
	}
	
	@Test
	public void testarConversaoDoNumeroRomanoDentroDosLimitesEstabelecidos(){
		ConverteNumero converteNumero = new ConverteNumero();
		String texto="MMMCMXCIX";
		Assert.assertEquals(3999, converteNumero.executaOperacao(texto));
	}
	
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
