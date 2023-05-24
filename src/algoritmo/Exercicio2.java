package algoritmo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Faça um programa que imprima na tela o seu nome n vezes. O seu nome deve ser
		//passado como parâmetro para o programa, juntamente com o valor de n.

		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = input.nextLine();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Nome: " + nome + " Numero: " + i);
		}
	}

}
