package Exercicio04;

import java.util.Scanner;

public class Treino04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = 0;
		double novoSalario = 0;
		double aumento = 0;
		double reajuste = 0;
		double total = 0;
		System.out.println("Qual o seu salario: ");
		salario = input.nextDouble();
		if(salario <= 750) {
			novoSalario = (salario * 0.05) + 100;
			total = novoSalario + salario;
			System.out.println(total);
		} 
		if(salario > 750) {
			aumento = salario * 0.05;
			reajuste = salario + aumento;
			System.out.println(reajuste);
		}
	}
}
