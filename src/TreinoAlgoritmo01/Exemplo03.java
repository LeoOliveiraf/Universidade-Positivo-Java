package Exercicio04;

import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um Sobrenome: ");
		String sobrenome = input.next();
		String nomeCompleto = null;
		int contador = 0;
		String total = " ";
		System.out.println("Digite os Nomes Completos: ");
		do {
			nomeCompleto = input.nextLine();
		if(nomeCompleto.contains(sobrenome)) {
			contador++;
			total = total.concat(" ");
			total = nomeCompleto.concat(total);
			total = total.concat(" ");
			}	
		}while(!nomeCompleto.equals("Fim"));
		System.out.println(contador);
		System.out.println(total);
		
		//metodo equalsIgnoreCase
	}
}
