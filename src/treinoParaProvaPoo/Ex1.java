package treinoParaProvaPoo;

public class Ex1 {
	
	public int fatorial(int number) {
		int soma = 0;
		int number2 = number - 1;
		int contador = number;
		for(int i = 1; i < contador;i++) {
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
	
	public int maior(int[] vetor) {
		int soma = vetor[0];
		for(int i = 0; i < vetor.length;i++) {
			if(vetor[i] > soma) {
				soma = vetor[i];
			}
		}
		return soma;
	}
	
	public void primo(int number) {
		boolean result = false;
		if(number % 2 != 0) {
			System.out.println("Numero Primo: " + (result = true));
		}
		
	}
	
	public void fibonacci(int number) {
		int soma = 0;
		int teste = 1;
		int result = 0;
		for(int i = 0; i < number; i++) {
			if(number == i) {
				break;
			}
			soma = soma + teste;
			teste += i;
			
			System.out.println(soma);
			
		}
	}
}
