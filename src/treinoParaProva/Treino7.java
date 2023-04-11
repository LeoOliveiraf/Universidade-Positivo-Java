package treinoParaProva;

import java.util.Scanner;

public class Treino7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe uma Palavra: ");
		String palavra = input.nextLine();
		System.out.println("Informe uma Letra: ");
		String letra = input.nextLine();
		
		if(palavra.toLowerCase().contains(letra)) {
			System.out.println("Letra contem na Palavra");
		}else {
			System.out.println("Letra Nao contem na Palavra");
		}
	}

}
