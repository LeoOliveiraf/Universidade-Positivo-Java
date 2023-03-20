package Exercicio04;

import java.util.Scanner;

public class Treino03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota = 0;
		int contador = 0;
		double soma = 0;
		double media = 0;
		do {
			System.out.println("Digite sua nota: ");
			nota = input.nextDouble();
			soma = soma + nota;
			contador++;
		}while(contador < 4);
		 media = soma / contador;
		 if(media > 60) {
			 System.out.println("Media Aprovado: " + media);
		 }
		 else {
			 System.out.println("Reprovado");
		 }
	}
}
