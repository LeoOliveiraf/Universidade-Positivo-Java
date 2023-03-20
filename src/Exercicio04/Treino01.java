package Exercicio04;

import java.util.Scanner;

public class Treino01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		System.out.println("Informe um numero: ");
		int soma = 0;
		if(numero > 0) {
			for(int contador=0; contador <= numero; contador++) {
				int par = contador % 2;
			if(par == 0) {
				soma += contador;
				System.out.println(contador);
				}
			}
		}
		else {
			System.out.println("Numero Invalido!");
		}
		System.out.println(soma);
	}
}
