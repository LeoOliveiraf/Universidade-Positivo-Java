package treinoParaProva;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino20 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Integer numero = 0;
		do {
		 System.out.println("Digite um numero:");
		 numero = input.nextInt();
		 if(array.contains(numero)) {
			 System.out.println("Ja contem no Array");
		 }else {
			 array.add(numero); 
		 }
		}while(numero != -1);
		System.out.println(array.toString());
	}

}
