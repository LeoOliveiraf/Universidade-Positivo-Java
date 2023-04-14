package treinoParaProva;

import java.util.Scanner;

public class Treino16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] vetor = new int[10];
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um Numero:");
			int numero = input.nextInt();
			vetor[i] = numero;
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				contador++;
				System.out.println("Pares do Vetor: " + "["+vetor[i]+"]" + " Posição:" + i);
			}
		}
		
	}

}
