package treinoParaProva;

import java.util.Scanner;

public class Treino17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero Verificação:");
		int verifica = input.nextInt();
		int [] vetor = new int[10];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um Numero:");
			int number = input.nextInt();
			vetor[i] = number;
		}
		int contador = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == verifica) {
				contador++;
			}
		}
		System.out.println("Quantidade Repete: " + contador);
	}

}
