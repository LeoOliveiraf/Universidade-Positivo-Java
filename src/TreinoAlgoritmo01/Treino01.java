package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		double imc = 0;
		System.out.println("Digite seu peso: ");
		peso = input.nextDouble();
		System.out.println("Digite sua Altura: ");
		altura = input.nextDouble();
		imc = altura * altura;
		imc = peso / imc;
		System.out.println("Seu IMC é: " + imc);
	}
}
