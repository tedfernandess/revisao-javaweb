package mz.co.tedfernandes.tarefas.controller;

public class ConverteNumero {

	public int converterNumeroRomano(char letra) {
		switch (letra) {
		case 'I':
			return 1;
		case 'X':
			return 10;
		case 'C':
			return 100;
		case 'M':
			return 1000;

		case 'V':
			return 5;
		case 'L':
			return 50;
		case 'D':
			return 500;

		default:
			return 0;
		}
	}

}
