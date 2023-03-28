package TreinoAlgoritmo02;

import java.util.Scanner;

public class Treino05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temperatura = 0;
		int opcao = 0;
		System.out.println("Digite a temperatura: ");
		temperatura = input.nextInt();
		System.out.println("Selecione uma opção");
		System.out.println("1 - Kelvin (K)");
		System.out.println("2 - Réaumur (Re)");
		System.out.println("3 - Rankine (Ra)");
		System.out.println("4 - Fahrenheit (F)");
		opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				double K = temperatura +  273.15;
				System.out.println(K);
				break;
				
			case 2:
				double Re = temperatura * 0.8;
				System.out.println(Re);
				break;
			
			case 3:
				double Ra = (temperatura * 1.8) + 459.67;
				System.out.println(Ra);
				break;
			
			case 4:
				double F = (temperatura * 1.8) + 32;
				System.out.println(F);
				break;
				
				default:
				System.out.println("Opção Invalida");
		}
	}
}
