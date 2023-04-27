package treinoParaProva;

import java.util.Scanner;

public class Treino24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Raio:");
		double raio = input.nextDouble();
		double area = 3.14159 * (raio*raio);
		System.out.println("A = " + area);
	}

}
