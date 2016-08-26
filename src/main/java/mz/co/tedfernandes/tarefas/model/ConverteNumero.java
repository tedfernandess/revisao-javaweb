package mz.co.tedfernandes.tarefas.model;

public class ConverteNumero {

	public int converterCaraterRomano(char letra) {
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

	public int converterNumeroRomano(String texto) {
		int n = 0;
		int numeroDaDireita = 0;
		for (int i = texto.length() - 1; i >= 0; i--) {
			int valor = converterCaraterRomano(texto.charAt(i));

			if (valor == 0) {
				return 0;
			}

			if ((valor - numeroDaDireita) > 0) {
				n += valor;
				numeroDaDireita = valor;
			} else if ((valor - numeroDaDireita) < 0) {
				n += valor * (-1);
				numeroDaDireita = valor;
			} else {
				n += valor;
				numeroDaDireita = valor;
			}
		}
		return n;
	}

}