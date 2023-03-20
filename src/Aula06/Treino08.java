package Aula06;

import java.util.Scanner;

public class Treino08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numero = null;
		String teste = null;
		String teste2 = null;
		System.out.println("Informe Um numero: ");
		numero = input.next();
		teste = numero.substring(0, 2);
		teste2 = numero.substring(2, 4);
	
		Integer primeiro = Integer.valueOf(teste);
		Integer segundo = Integer.valueOf(teste2);
		
		int soma  = primeiro + segundo;
		int result = soma * soma;
		System.out.println(soma);
		System.out.println(result);
	}
}
