package algoritmo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Faça um programa que imprima na tela o seu nome 10 vezes. O seu nome deve ser
		//passado como parâmetro para o programa.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = input.nextLine();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(nome);
		}
	}

}
