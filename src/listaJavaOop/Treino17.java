package listaJavaOop;

import java.util.Scanner;

public class Treino17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		double deposito= 0;
		double saque = 0;
		System.out.println("Escolha uma opção: \n"
				 + "1- Entrar \n"
				 + "2- Sair \n");
		Integer num = scanner.nextInt();
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n"
					 + "1- Consulta\n"
					 + "2- Saldo\n"
					 + "3- Saque \n"
					 + "4- Deposito\n"
					 + "5- Sair\n");
			Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
				System.out.println("Saldo: " + saldo);
				System.out.println("Ultimo Saque: " + saque);
				System.out.println("Ultimo Deposito: " + deposito);
				break;
			}
			case 2: {
			    System.out.println(saldo);
				break;
			}
			case 3: {
				saque = scanner.nextDouble();
				if(saldo >= saque) {
					saldo = saldo - saque;
					System.out.println("Sacado com Sucesso");
				}else {
					System.out.println("Saldo Insuficiente");
				}
				break;
			}
			case 4: {
				deposito = scanner.nextDouble();
				saldo = saldo + deposito;
				System.out.println("Depositado Sucesso");
				break;
			}
			default:
				num = 2;
				System.out.println("Obrigado por usar Noosso Serviços :)");
			}
		}
		
	}
}
