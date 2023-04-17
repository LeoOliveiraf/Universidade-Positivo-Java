package treinoParaProva;

public class Trabalho1 {
	public int fatorial(int number) {
		int soma = 0; 
		int cont = number;
		int number2 = number - 1;
		for(int i= 1; i < cont; i++) {
			soma = number * number2;
			number = soma;
			number2--;
		}
		return soma;
	}
	
	public int expo(int x, int y) {
		int soma = 0;
		int teste = 1;
		for(int i = 0; i < y; i++) {
			soma = x * teste;
			teste = soma;
		}
		return soma;
	}
	public int maior(int [] vetor) {
		int soma = vetor[0];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > soma) {
				soma = vetor[i];
			}
		}
		return soma;
	}
}

