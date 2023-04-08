package ExercicioOrientacao;

import java.util.Scanner;

public class Treino19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double multiplicar = 0;
		double somar = 0;
		double dividir = 0;
		double subtrair = 0;
		System.out.println("Escolha uma opção: \n"
				 + "1- Entrar \n"
				 + "2- Sair \n");
		Integer num = scanner.nextInt();
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n"
					 + "1- Multiplicar\n"
					 + "2- Somar\n"
					 + "3- Subtrair\n"
					 + "4- Dividir\n"
					 + "5- Sair\n");
			Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
				System.out.println("Digite Primeiro Valor: ");
				double valor1 = scanner.nextDouble();
				System.out.println("Digite Segundo Valor: ");
				double valor2 = scanner.nextDouble();
				multiplicar = valor1 * valor2;
				System.out.println("Multiplica: " + multiplicar);
				break;
			}
			case 2: {
				System.out.println("Digite Primeiro Valor: ");
				double valor1 = scanner.nextDouble();
				System.out.println("Digite Segundo Valor: ");
				double valor2 = scanner.nextDouble();
				somar = valor1 + valor2;
				System.out.println("Soma: " + somar);
				break;
			}
			case 3: {
				System.out.println("Digite Primeiro Valor: ");
				double valor1 = scanner.nextDouble();
				System.out.println("Digite Segundo Valor: ");
				double valor2 = scanner.nextDouble();
				subtrair = valor1 - valor2;
				System.out.println("Subtracao: " + subtrair);
				break;
			}
			case 4: {
				System.out.println("Digite Primeiro Valor: ");
				double valor1 = scanner.nextDouble();
				System.out.println("Digite Segundo Valor: ");
				double valor2 = scanner.nextDouble();
				dividir = valor1 / valor2;
				System.out.println("Divisao: " + dividir);
				break;
			}
			default:
				num = 2;
				System.out.println("Obrigado por usar Noosso Serviços :)");
			}
		}
	}
}
