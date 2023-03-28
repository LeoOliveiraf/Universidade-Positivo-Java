package TreinoAlgoritmo02;

import java.util.Random;
import java.util.Scanner;

public class Treino13 {
	public static void main(String[] args) {
		Random numberAleato = new Random();
		Scanner input = new Scanner(System.in);
		int valor = numberAleato.nextInt(100);
		int numberUsu = 0;
		System.out.println("Informe um valor de 0 a 100");
		int i = 0;
		while(numberUsu != valor) {
			numberUsu = input.nextInt();
			
			if(numberUsu == valor) {
					System.out.println("Parabens, Você acertou!");
					System.out.println("Valor Aleatorio: " + valor);
					System.out.println("Seu Valor: " + numberUsu);
			}
			if(valor > numberUsu) {
				System.out.println("Numero digitado é MENOR que numero Aleatorio!");
			}else if(valor < numberUsu){
				System.out.println("Numero digitado é MAIOR que numero Aleatorio!");
			}
			i++;
		}
		System.out.println("Você tentou vezes " + i + " ate ACERTAR.");
	}
}
