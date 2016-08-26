package mz.co.tedfernandes.tarefas.controller;

import org.junit.Assert;
import org.junit.Test;

public class ConverterNumeroTest {

	@Test
	public void deveConverterNumeroRomanoComUmCarater(){
		ConverteNumero converteNumero = new ConverteNumero();
		char letra='M';
		Assert.assertEquals(1000, converteNumero.converterNumeroRomano(letra));
	}
	
}
