package Exercicio04;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		int result = 0;
		int contador = 0;
		do {
			System.out.println("Informe um numero: ");
			numero = input.nextInt();
			soma = soma + numero;
		if(numero != 0) {
			contador++;
		}
		}while(numero != 0);
		System.out.println("Soma: " + soma);
		 result = soma/contador;
		 System.out.println("Media: " + result);
	}
}
