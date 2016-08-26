package mz.co.tedfernandes.tarefas.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterNumeroTest {

	private ConverteNumero converterNumero;
	
	@Before
	public void inicializacao(){
		this.converterNumero = new ConverteNumero();
	}
	
	@Test
	public void deveConverterNumeroRomanoComUmCaraterValido(){
		String letra="M";
		Assert.assertEquals(1000, this.converterNumero.executaOperacao(letra));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveConverterNumeroRomanoComUmCaraterInvalido(){
		String texto = "A";
		this.converterNumero.executaOperacao(texto);
	}
	
	@Test
	public void testarConversaoDoNumeroRomanoDentroDosLimitesEstabelecidos(){
		String texto="MMCMXCIX";
		Assert.assertEquals(2999, this.converterNumero.executaOperacao(texto));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveConverterNumeroRomanoForaDosLimitesEstabelecidos(){
		String texto="MMMMCMXCIX";
		this.converterNumero.executaOperacao(texto);
	}
	
	@Test
	public void deveConverterMenorNumeroRomano(){
		String texto="I";
		Assert.assertEquals(1, this.converterNumero.executaOperacao(texto));
	}
	
	@Test
	public void deveConverterMaiorNumeroRomanoEstabelecido(){
		String texto="MMMCMXCIX";
		Assert.assertEquals(3999, this.converterNumero.executaOperacao(texto));
	}
	
}
