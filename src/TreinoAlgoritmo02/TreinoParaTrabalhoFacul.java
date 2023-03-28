package TreinoAlgoritmo02;

import java.util.ArrayList;
import java.util.Scanner;

public class TreinoParaTrabalhoFacul {
	public static void main(String[] args) {
		/*EXERCICIO 01
		 * Scanner input = new Scanner(System.in);
		int valor = 0;
		boolean verifica = true;
		int maior = 0;
		int menor = 0;
		int contador = 0;
		int soma = 0;
		System.out.println("Informe um valor: ");
		do {
			valor = input.nextInt();
			soma = soma + valor;
			if(verifica == true) {
				maior = valor;
				menor = valor;
			}
			verifica = false;
			if(valor >= 0) {
			if(maior < valor) {
				maior  = valor;
			}
			if(menor > valor) {
				menor = valor;
			}
			}
			contador++;
		}while(valor >= 0);
		int media = soma / contador;
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media);
		*/
		//EXERCICIO 02
		/*	
		Scanner input = new Scanner(System.in);
		String numero = null;
		String primeira = null;
		String segunda = null;
		numero = input.next();
		primeira = numero.substring(0, 2);
		segunda = numero.substring(2, 4);
		Integer valor1 = Integer.valueOf(primeira);
		Integer valor2 = Integer.valueOf(segunda);
		int resultado = valor1 + valor2;
		int soma = resultado * resultado;
		System.out.println(resultado);
		System.out.println(soma);
		*/
		/*Scanner input = new Scanner(System.in);
		int chico = 2;
		int ze = 3;
		int alturaC = 150;
		int alturaZ = 110;
		int altura = (alturaC - alturaZ) + 1;
		int diferenca = ze  - chico;
		int soma  = diferenca * altura;
		System.out.println("Anos: " + soma);
		*/
		//EXERCICIO 04
		/*Scanner input = new Scanner(System.in);
		ArrayList<Integer> grama = new ArrayList<Integer>();
		int massa, contador = 0;
		System.out.println("Informe a massa em gramas: ");
		massa = input.nextInt();
		double divisao = massa / 2;
		grama.add((int) divisao);
		while(divisao > 0.5) {
			divisao = divisao / 2;
			grama.add((int) divisao);
			contador++;
		}
		double segundos = contador * 50;
		double minutos = segundos / 60;
		segundos %= 60;
		double hora = segundos / 3600;
		segundos %= 60;
		System.out.println("\nInicio: " + massa);
		System.out.printf("\nSegundos: %.1f", segundos);
		System.out.printf("\nMinutos: %.1f", minutos);
		System.out.printf("\nHoras: %.1f", hora);
		System.out.printf("\nFinal: %.2f", divisao);
		*/
		//EXERCICIO 05
		/*Scanner input = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		int[][] novaMatriz = new int[2][2];
		boolean verifica = false;
		boolean verifica2 = false;
		boolean verifica3 = false;
		boolean verifica4 = false;
		System.out.println("Informe os valores: ");
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = input.nextInt();
			}
		}
		for(int linhaN = 0; linhaN < novaMatriz.length; linhaN++) {
			for(int colunaN = 0; colunaN < novaMatriz.length; colunaN++) {
				novaMatriz[0][0] = 0;
			}
		}
		int primeira, segunda, soma = 0;
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("["+matriz[linha][coluna]+"]");
				primeira = matriz[0][0] * matriz[1][1];
				segunda = matriz[0][1] * matriz[1][0];
				soma = primeira - segunda;
			}
			System.out.println();
		}
		System.out.println("Determinante Matriz: " + soma);
		for(int linhaN = 0; linhaN < novaMatriz.length; linhaN++) {
			for(int colunaN = 0; colunaN < novaMatriz.length; colunaN++) {
				novaMatriz[linhaN][colunaN] = matriz[colunaN][linhaN];
				System.out.println("["+novaMatriz[linhaN][colunaN]+"]");
				
			}
			System.out.println();
		}
		if(matriz[0][0] == novaMatriz[0][0]) {
			verifica = true;
		}
		if(matriz[0][1] == novaMatriz[0][1]) {
			verifica2 = true;
		}
		if(matriz[1][0] == novaMatriz[1][0]) {
			verifica3 = true;
		}
		if(matriz[1][1] == novaMatriz[1][1]) {
			verifica4 = true;
		}
		if(verifica == true && verifica2 == true && verifica3 ==  true && verifica4 ==true) {
			System.out.println("Matrizes Iguais");
		}
		*/
		/*Scanner input = new Scanner(System.in);
		int velocidade = 0;
		int limiteVia = 0;
		System.out.println("Informe a velocidade: ");
		velocidade = input.nextInt();
		System.out.println("Informe o limite da Via: ");
		limiteVia = input.nextInt();
		double soma = 0;
		double metade = 0;
		soma = 0.2 * limiteVia;
		soma = soma + limiteVia;
		metade = 0.5 * limiteVia;
		metade = metade + limiteVia;
		if(velocidade > limiteVia && velocidade < soma) {
			System.out.println("R$130,16");
		}
		if(velocidade > soma && velocidade < metade) {
			System.out.println("R$195,23");
		}
		if(velocidade > limiteVia && velocidade > metade) {
			System.out.println("R$880,41");
		}
		*/
		Scanner input = new Scanner(System.in);
		String nome = null;
		System.out.println("Informe Nome Completo: ");
		nome = input.nextLine();
		String[] separacao = nome.split(" ");
		for(int i= 0; i < separacao.length; i++) {
			if(separacao[i].length() > 2) {
				char result = separacao[i].charAt(0);
				System.out.print(result + ".");
			}
			else {
				System.out.print(separacao[i] + " ");
			}
		}
		
	}
}
