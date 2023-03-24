package Exercicio04;

import java.util.Scanner;

public class Aula10De03De23Nume02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor [] = new int[10];
		System.out.println("Informe 10 Numeros: ");
		for(int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		int numero = 0;
		System.out.println("Escolha um numero: ");
		numero = input.nextInt();
		int contador = 0;
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == numero ) {
				contador++;
			}
		}
		System.out.println(contador);
	}
}
