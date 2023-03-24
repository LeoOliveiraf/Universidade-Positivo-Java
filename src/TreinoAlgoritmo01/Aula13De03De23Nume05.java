package Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;


public final class Aula13De03De23Nume05 {
	public static void main(String[] args) {
		ArrayList<Integer> menu = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		 int opcao = 0;
			while(opcao != 7) {
				System.out.println( "1- Adicionar um Numero: \n"
						+  "2- Remover um Numero: \n" 
				 		+ "3- Verifica a Posição de Um numero: \n"
				 		+ "4- Modificar um Numero de uma Posição: \n"
				 		+ "5- Media do Valores: \n"
				 		+ "6- Imprime Todos Numeros: \n"
				 		+ "7- Sair");
				opcao = input.nextInt();
				switch(opcao) {
				case 1:
					System.out.println("Digite seu Numero: ");
					int AdNumero = input.nextInt();
					menu.add(AdNumero);
				break;
				case 2: 
					System.out.println("Digite o Numero para Remover: ");
				    Integer ReNumero = input.nextInt();
				    menu.remove(ReNumero);
				    System.out.println("Numero Removido: " + ReNumero);	
				break;	
				case 3:
					int PoNumero = 0;
					System.out.println("Digite o valor Para saber a posição: ");
					PoNumero = input.nextInt();
					for(int i = 0; i < menu.size(); i++) {	
						if(menu.get(i).equals(PoNumero) == true) {
							System.out.println("O valor que voce informou esta na Posição: " + i);
						}
					}
				break;
				case 4:
					int MoNumero = 0;
					for(int i = 0; i < menu.size(); i++){
						System.out.println("Posição: ["+i+"]"  + " Valor: " + menu.get(i) + "\n");
					}
					System.out.println("Informe a posição do Numero a ser Modificado: ");
					MoNumero = input.nextInt();
					int NovoNumero = 0;
					System.out.println("Informe o novo Valor: ");
					NovoNumero = input.nextInt();
					menu.set(MoNumero, NovoNumero);	
					System.out.println("\n");
				break;
				case 5: 
					int soma = 0;
					int contador = 0;
					double result = 0;
				for(int i = 0; i < menu.size(); i++) {
					soma = soma + menu.get(i);
					contador++;
				}
				result = soma/contador;
				System.out.println("A media dos Valores informados é: " + result);
				break;
				case 6: 
					 for(Integer fila : menu) {
		                    System.out.print("[" + fila + "]");
		                }
		                System.out.println("\n");
				break;
				case 7: 
					System.out.println("Voce saiu do Menu, Ate Logo");
				break;
				
				default: 
					System.out.println("Opção Invalida, Escolha uma opção do Menu!");
			}
		}
	}
}
