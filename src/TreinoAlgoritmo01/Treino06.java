package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a numHora: ");
		double numHora = input.nextDouble();
		System.out.println("Digite a valorHora: ");
		double valorHora = input.nextDouble();
		System.out.println("Digite filhos: ");
		int qtdfilhos = input.nextInt();
		double salario = 0;
		salario = numHora * valorHora;
		System.out.println(salario); 
		if(salario > 0 && salario <= 1302) {
			double porcentagem1 = 0.075  * salario; 
			salario = salario - porcentagem1;
			System.out.println("7.5% INSS: " + salario);
		}
		if(salario > 1302 && salario <= 2571) {
			double porcentagem2 = 0.09 * salario;
			salario = salario - porcentagem2;
			System.out.println("9% INSS: " + salario);
		}
		if(salario > 2571 && salario <= 3856) {
			 double porcentagem3 = 0.12 * salario;
			salario = salario - porcentagem3;
			System.out.println("12% INSS: " + salario);
		}
		if(salario > 3856 && salario <= 7507) {
			double porcentagem4 = 0.14 * salario;
			salario = salario - porcentagem4;
			System.out.println("14% INSS: " + salario);
		}
		
		double salarioFinal = (0.3 * salario) * qtdfilhos;
		salarioFinal = salarioFinal + salario;
		System.out.println("Seu salario Liquido é de: " + salarioFinal);
	}
}
