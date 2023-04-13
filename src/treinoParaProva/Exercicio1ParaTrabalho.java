package treinoParaProva;

public class Exercicio1ParaTrabalho {
	
	public void fatorial(int num1) {
		Integer num2 = num1 -1;
		Integer contador = num1;
		Integer soma = 0;
		
		for(int i = 1; i < contador; i++) {
			if(num2 > 0) {
				soma = num1 * num2;
				num1 = soma;
				num2--;
			}
		}
		System.out.println("Fatorial: " + soma);
	}
	
	public void exponencial(int x, int y) {
		Integer soma = 0;
		Integer teste = 1;
		for(int i = 0; i < y; i++) {
			soma = x * teste;
			teste = soma;
		}
		System.out.println("Exponencial: " + teste);
	}
	
	public void maior(int[] vetor) {
		int soma = vetor[0];
		int i;
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] > soma) {
				soma = vetor[i];
		}
	}
	System.out.println("Valor maior do Vetor: " + soma);
}
}
