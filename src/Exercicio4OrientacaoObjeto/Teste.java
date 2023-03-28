package Exercicio4OrientacaoObjeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ocupado = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Lugares Disponiveis " + i);
		}
		for(int i = 1; i <= 10; i++) {
		int lugar = input.nextInt();
		if(ocupado.contains(lugar)) {
			//VERIFICA Poltrona
			System.out.println("Lugar Ocupado!");
		}else {
			ocupado.add(lugar);
			System.out.println("Lugar Livre!");
		}
		if(ocupado.size() == 10) {
			System.out.println("VOO CHEIO!");
		}else {
			System.out.println("Lugares Ocupados: " + ocupado);
		}
		}
		
	}
}
