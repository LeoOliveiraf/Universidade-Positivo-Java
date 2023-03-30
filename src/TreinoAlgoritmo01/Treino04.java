package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		System.out.println("Digite Numero1: ");
		numero1 = input.nextInt();
		System.out.println("Digite Numero2: ");
		numero2 = input.nextInt();
		System.out.println("Digite Numero3: ");
		numero3 = input.nextInt();
		if(numero1 < numero2 && numero1 < numero3) {
			System.out.println(numero1);
		}
		if(numero2 < numero1 && numero2 < numero3) {
			System.out.println(numero2);
		}
		if(numero3 < numero2 && numero3 < numero1) {
			System.out.println(numero3);
		}
	}
}
