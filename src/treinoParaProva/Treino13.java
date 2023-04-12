package treinoParaProva;

import java.util.Scanner;

public class Treino13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer valor = 1;
		Integer i = 0;
		Integer soma = 0;
		while(valor != 0) {
			System.out.println("Digite um Valor");
			valor = input.nextInt();
			if(valor != 0) {
				soma += valor;
				i++;
			}
		}
		Integer media = soma / i;
		System.out.println("Media: " + media);
	}
}
