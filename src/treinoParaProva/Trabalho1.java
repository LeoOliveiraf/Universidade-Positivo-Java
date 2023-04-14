package treinoParaProva;

public class Trabalho1 {
	
	public void fatorial(int numero) {
		int contador = numero;
		int soma = 0;
		int numero2 = numero - 1;
		for(int i =1; i < contador; i++) {
			soma = numero * numero2;
			numero = soma;
			numero2--;
		}
		System.out.println("Fatorial: " + soma);
	}
	
	public void exponencial(int x, int y) {
		int soma = 0;
		int number = 1;
		for(int i = 0; i < y; i++) {
			soma = x * number;
			number = soma;
		}
		System.out.println("Exponencial: " + number);
	}
	
	public void maior(int vetor[]) {
		int soma = vetor[0];
		for(int i =0; i < vetor.length;i++) {
			if(vetor[i] > soma) {
				soma = vetor[i];
			}
		}
		System.out.println("Valor Maior: " + soma);
	}
}
