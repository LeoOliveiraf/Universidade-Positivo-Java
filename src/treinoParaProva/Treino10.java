package treinoParaProva;

import java.util.Scanner;

public class Treino10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a Frase: ");
		String palavra = input.nextLine();
		
		String[] frase = palavra.split("");
		
		int i;
		int cont = 0;
		for(i = 0; i < frase.length; i++) {
			
		}
		System.out.println("Total Caracteres ["+i+"]");
		
		String[] qtdPalavra = palavra.split(" ");
		for(i = 0; i < qtdPalavra.length; i++) {
			 palavra.split(" ");
			 cont ++;
		}
		System.out.println("Quantidade Palavra: " + cont);
	}
}
