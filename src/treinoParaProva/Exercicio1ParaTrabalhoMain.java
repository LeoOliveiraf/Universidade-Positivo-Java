package treinoParaProva;

import java.util.Scanner;

public class Exercicio1ParaTrabalhoMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[] {10, 200, 30, 80, 300};
		Exercicio1ParaTrabalho fatorial = new Exercicio1ParaTrabalho();
		System.out.println("Digite: ");
		Integer num1 = input.nextInt();
		fatorial.fatorial(num1);
	
		Exercicio1ParaTrabalho exponencial = new Exercicio1ParaTrabalho();
		System.out.println("Digite a Base:");
		Integer x = input.nextInt();
		System.out.println("Digite Outro Valor:");
		Integer y = input.nextInt();
		exponencial.exponencial(x, y);
		
		Exercicio1ParaTrabalho maior = new Exercicio1ParaTrabalho();
		maior.maior(vetor);
	}

}
