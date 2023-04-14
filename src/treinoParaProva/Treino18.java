package treinoParaProva;

import java.util.Scanner;

public class Treino18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] vetor = new String[5];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um Nome:");
			String nome = input.nextLine();
			vetor[i] = nome;
		}
		int contador = 0;
		System.out.println("Nome para Verificar:");
		String nomeVerifica = input.next();
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].contains(nomeVerifica)) {
				contador++;
			}
		}
		System.out.println("Quantidade Pessoas com Mesmo Nome: "+ contador);

	}

}
