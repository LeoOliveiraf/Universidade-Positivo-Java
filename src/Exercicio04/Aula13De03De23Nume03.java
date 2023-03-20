package Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Aula13De03De23Nume03 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int valor = 0;
		System.out.println("Informe um valor: ");
		valor = input.nextInt();
		do {
			System.out.println("Informe um valor: ");
			
			if(number.contains(valor)) {
				System.out.println("Valor Repedido!!");
			}else{
				number.add(valor);
			}
			valor = input.nextInt();
		}while(valor != -1);
		System.out.println("Array antes da ordenação: " + number.toString());
		Collections.sort(number);
		System.out.println("Array depois da ordenação: " + number.toString());
	}
}
