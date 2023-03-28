package TreinoAlgoritmo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe Um Nome Completo: ");
		String nomeComp = input.nextLine();
		String[] separado = nomeComp.split(" ");
		for( int i = 0; i < separado.length; i++) {
			if(separado[i].length() > 2) {
				char resultFinal = separado[i].charAt(0);
				System.out.print(resultFinal + ".");
			}else {
				System.out.print(separado[i] + " ");
			}
			
		}
		
	}
}
