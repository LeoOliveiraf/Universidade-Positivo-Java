package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a nota1: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite a nota2: ");
		double nota2 = input.nextDouble();
		System.out.println("Digite a nota3: ");
		double nota3 = input.nextDouble();
		double media = (nota1 + nota2 + nota3)/3;
		if(media > 0 && media <= 4.9) {
			System.out.println("Aluno em Recuperação");
			double precisaPassar = (10 - media) + 2;
			System.out.println("Aluno precisa de " + precisaPassar + " para passar na materia");
		}
		if(media >= 5 && media <= 6.9) {
			System.out.println("Aluno em Prova Final");
			double pontos = 10 - media;
			System.out.println("Aluno precisa de " + pontos + " para passar na materia");
		}
		if(media >= 7 && media <= 10) {
			System.out.println("Aluno passado por media!");
		}
	}
}
