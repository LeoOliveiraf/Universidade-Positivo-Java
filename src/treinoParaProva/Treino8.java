package treinoParaProva;

import java.util.Scanner;

public class Treino8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe uma Palavra: ");
		String palavra = input.nextLine();
		
		System.out.println("Minuscula: " + palavra.toLowerCase());
		System.out.println("Maiuscula: " + palavra.toUpperCase());
	}
}
