package treinoParaProva;

import java.util.Scanner;

public class Treino12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um Numero:");
		Integer numero = input.nextInt();
		
		if(numero > 0) {
			Integer pares = 0;
			for(int i = 0; i <= numero; i++) {
				if(i % 2 == 0) {
					pares += i;
				}
			}
			System.out.println(pares);
		}else {
			System.out.println("Numero Invalido");
		}
	}
}
