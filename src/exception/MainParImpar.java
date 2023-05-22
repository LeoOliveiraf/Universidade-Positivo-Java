package exception;

import java.util.Scanner;

public class MainParImpar {
	public static void main(String[] args) {
		ParImpar p = new ParImpar();
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Informe um Numero");
		numero = in.nextInt();
		p.setNumero(numero);
		p.verificaParImpar();
		
		System.out.println("\nInforme outro Numero:");
		numero = in.nextInt();
		p.setNumero(numero);
		try {
			p.verificaParImpar2();
		}catch (ExcecaoParImpar e) {
			System.out.println(e.toString());
		}
	}

}
