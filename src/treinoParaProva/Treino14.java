package treinoParaProva;

import java.util.Scanner;

public class Treino14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome = null;
		String sobrenome;
		Integer i = 0;
		int fim = 1;
		System.out.println("Digite um Sobrenome:");
		sobrenome = input.next();
		
		while(nome != "fim") {
			System.out.println("Digite um Nome:");
			nome = input.nextLine();
			if(nome.contains(sobrenome)) {
				i++;
			}
		}
		System.out.println("Total de Pessoas com Mesmo Sobrenome: " + i);
		
	}
}
