package treinoParaProva;

import java.util.Scanner;

public class Treino6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		Integer dia = input.nextInt();
		System.out.println("Informe o mes: ");
		Integer mes = input.nextInt();
		System.out.println("Informe o ano: ");
		Integer ano = input.nextInt();
		
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}
