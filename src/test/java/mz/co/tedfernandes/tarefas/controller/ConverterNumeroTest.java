package mz.co.tedfernandes.tarefas.controller;

import org.junit.Assert;
import org.junit.Test;

public class ConverterNumeroTest {

	@Test
	public void deveConverterNumeroRomanoComUmCaraterValido(){
		ConverteNumero converteNumero = new ConverteNumero();
		char letra='M';
		Assert.assertEquals(1000, converteNumero.converterNumeroRomano(letra));
	}
	
	@Test
	public void naoDeveConverterNumeroRomanoComUmCaraterInvalido(){
		ConverteNumero converteNumero = new ConverteNumero();
		char letra='A';
		Assert.assertEquals(0, converteNumero.converterNumeroRomano(letra));
	}
	
}
