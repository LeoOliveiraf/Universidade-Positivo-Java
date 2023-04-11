package treinoParaProva;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino9 {

	public static void main(String[] args) {
		String frase = "LEONARDO";
		
		String[] palavra = frase.split("");
		String letra = "O";
		for(int i = 0; i < palavra.length; i++) {
			if(palavra[i].equalsIgnoreCase(letra)){
				System.out.println("Posição Letra["+i+"]");
			}
		}
		
	}

}
