package mz.co.tedfernandes.tarefas.model;

public class ConverteNumero {

	public int executaOperacao(String texto) {
		return this.converterNumeroRomano(texto.toUpperCase().trim());
	}

	private int converterCaraterRomano(char letra) {
		return (int) (Math.pow(10, "IXCM".indexOf(letra)) + 5 * (Math.pow(10, "VLD".indexOf(letra))));
	}

	private int converterNumeroRomano(String texto) {
		// TODO Refatorar este método
		int n = 0;
		int numeroDaDireita = 0;
		for (int i = texto.length() - 1; i >= 0; i--) {
			int valor = converterCaraterRomano(texto.charAt(i));

			if (valor == 0) {
				throw new IllegalArgumentException();
			}

			if ((valor - numeroDaDireita) >= 0) {
				n += valor;
				numeroDaDireita = valor;
			} else {
				n += valor * (-1);
				numeroDaDireita = valor;
			}
		}
		if(n>3999 || n<=0){
			throw new IllegalArgumentException();
		}else{
			return n;
		}
	}

}
