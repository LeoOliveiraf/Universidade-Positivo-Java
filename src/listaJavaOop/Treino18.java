package listaJavaOop;

import java.util.Scanner;

public class Treino18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor = 0;
		Integer cont = 0;
		double soma = 0;
		do {
			System.out.println("Digite um Valor: ");
			valor = input.nextDouble();
			soma = soma + valor;
			cont ++;
		}while(valor != 0);
		cont = cont -1;
		System.out.println(cont);
		System.out.println(soma);
		double result = soma / cont;
		System.out.println(result);
		
	}
}
