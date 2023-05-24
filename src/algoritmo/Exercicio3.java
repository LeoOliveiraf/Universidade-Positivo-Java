package algoritmo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Faça um programa que imprima na tela o seu nome n vezes. Tanto o seu nome como
		//o valor de n devem ser lidos do teclado.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = input.nextLine();
		System.out.println("Digite Quantas vezes vai aparecer:");
		int quantidade = input.nextInt();
		
		for(int i = 0; i <= quantidade; i++) {
			System.out.println("Nome: " + nome + " Numero: " + i);
		}
	}

}
