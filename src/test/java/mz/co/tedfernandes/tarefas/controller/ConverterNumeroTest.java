package mz.co.tedfernandes.tarefas.controller;

import org.junit.Assert;
import org.junit.Test;

import mz.co.tedfernandes.tarefas.model.ConverteNumero;

public class ConverterNumeroTest {

	@Test
	public void deveConverterNumeroRomanoComUmCaraterValido(){
		ConverteNumero converteNumero = new ConverteNumero();
		char letra='M';
		Assert.assertEquals(1000, converteNumero.converterCaraterRomano(letra));
	}
	
	@Test
	public void naoDeveConverterNumeroRomanoComUmCaraterInvalido(){
		ConverteNumero converteNumero = new ConverteNumero();
		char letra='A';
		Assert.assertEquals(0, converteNumero.converterCaraterRomano(letra));
	}
	
	@Test
	public void testarConversaoDoNumeroRomanoDentroDosLimitesEstabelecidos(){
		ConverteNumero converteNumero = new ConverteNumero();
		String texto="MMMCMXCIX";
		Assert.assertEquals(3999, converteNumero.converterNumeroRomano(texto));
	}
	
}
