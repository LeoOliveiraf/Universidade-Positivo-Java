package treinoParaProva;

import java.util.Scanner;

public class Treino5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a distancia: ");
		double distancia = input.nextInt();
		System.out.println("Informe o Tempo: ");
		double tempo = input.nextInt();
		
		double vm = distancia / tempo;
		System.out.println("Velocidade Media: " + vm);
	}
}
