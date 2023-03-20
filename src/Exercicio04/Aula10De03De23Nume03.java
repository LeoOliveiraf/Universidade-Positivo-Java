package Exercicio04;

import java.util.Scanner;

public class Aula10De03De23Nume03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vetor [] = new String[5];
		int contador = 0;
		String nome;
		System.out.println("Informe 05 Nomes Completos: ");
		
		for(int i = 0; i < 5; i++) {
			vetor[i] = input.nextLine().toLowerCase();
		}
		
		System.out.println("Escreva um nome ou sobrenome: ");
		nome = input.nextLine().toLowerCase();
		for(int i =0; i < 5; i++) {
			if(vetor[i].contains(nome)) {
				contador++;
			}
		}
		System.out.println(contador);
	
	}
}
