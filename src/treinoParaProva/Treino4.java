package treinoParaProva;

import java.util.Scanner;

public class Treino4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o primeiro Valor: ");
		Integer number1 = input.nextInt();
		System.out.println("Informe o segundo Valor: ");
		Integer number2 = input.nextInt();
		
		Integer soma = number1 + number2;
		System.out.println("Soma: " + soma);
		
		double multiplica = number1 * number2;
		System.out.println("Multiplica: " + multiplica);
		
		Integer subtracao = number1 - number2;
		System.out.println("Subtracao: " + subtracao);
		
		double divisao = number1 / number2;
		System.out.println("Divisao: " + divisao);
		
		double restoDivi = number1 % number2;
		System.out.println("Resto d Divisao: " + restoDivi);
	}

}
