package mz.co.tedfernandes.tarefas.model;

import org.junit.Assert;
import org.junit.Test;

public class ConverterNumeroTest {

	@Test
	public void deveConverterNumeroRomanoComUmCaraterValido(){
		ConverteNumero converteNumero = new ConverteNumero();
		String letra="M";
		Assert.assertEquals(1000, converteNumero.executaOperacao(letra));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveConverterNumeroRomanoComUmCaraterInvalido(){
		ConverteNumero converteNumero = new ConverteNumero();
		String texto = "AAA";
		converteNumero.executaOperacao(texto);
	}
	
	@Test
	public void testarConversaoDoNumeroRomanoDentroDosLimitesEstabelecidos(){
		ConverteNumero converteNumero = new ConverteNumero();
		String texto="MMMCMXCIX";
		Assert.assertEquals(3999, converteNumero.executaOperacao(texto));
	}
	
}
