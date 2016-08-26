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
	
	@Test
	public void deveConverterNumeroDentroDosLimitesEstabelecidos(){
		
		this.numeroRomano.sendKeys("XIX");
		this.numeroRomano.submit();
		boolean achouTexto = driver.getPageSource().contains("19");
		Assert.assertTrue(achouTexto);
		
	}
	
	@Test
	public void naoDeveConverterNumeroForaDosLimitesEstabelecidos(){

		this.numeroRomano.sendKeys("MMMMCMXCIX");
		this.numeroRomano.submit();
		boolean achouTexto = driver.getPageSource().contains("Argumento Inválido");
		Assert.assertTrue(achouTexto);
		
	}
	
	@Test
	public void naoDeveConverterNumeroRomanoComCaracteresQueNaoRepresentamNumerosRomanos(){

		this.numeroRomano.sendKeys("MMMAIX");
		this.numeroRomano.submit();
		boolean achouTexto = driver.getPageSource().contains("Argumento Inválido");
		Assert.assertTrue(achouTexto);
		
	}
	
	@Test
	public void deveAceitarConverterNumeroRomanoComCaracteresMinusculos(){

		this.numeroRomano.sendKeys("xxxviii");
		this.numeroRomano.submit();
		boolean achouTexto = driver.getPageSource().contains("38");
		Assert.assertTrue(achouTexto);
		
	}
	
	@Test
	public void deveAceitarConverterNumeroRomanoComEspacamentoNoFimQueNaoRepresentaNada(){

		this.numeroRomano.sendKeys("xxvii     ");
		this.numeroRomano.submit();
		boolean achouTexto = driver.getPageSource().contains("27");
		Assert.assertTrue(achouTexto);
		
	}
	
}
