

package Exercicio04;

import java.util.Scanner;

public class Aula10De03De23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor [] = new int[10];
	
		System.out.println("Informe os 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.println("Conteudo: " + vetor[i] + " Posição: " + i);
			}
		}
	}
}


