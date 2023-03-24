package Aula06;


import java.util.Scanner;

public class Treino11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		int [][] novaMatriz = new int[2][2];
		int linha = 0;
		int coluna = 0;
		for(linha = 0; linha < 2; linha++) {
			for(coluna = 0; coluna < 2; coluna++) {
				System.out.println("Informe um valor: ");
				matriz[linha][coluna] = input.nextInt();
			}			
		}
		for(int linhaNova = 0; linhaNova < 2; linhaNova++) {
			for(int colunaNova = 0; colunaNova < 2; colunaNova++) {
				novaMatriz[linhaNova][colunaNova] = 0;
			}
		}
		int primeira, segunda, determinante = 0;
		for(linha = 0; linha < 2; linha++) {
			for(coluna = 0; coluna < 2; coluna++) {
				System.out.print("["+matriz[linha][coluna]+"]");
				primeira= matriz[0][0] * matriz[1][1];
				segunda = matriz[0][1] * matriz[1][0];
				determinante =  primeira - segunda;
			}
			System.out.println();
		}
		System.out.println();
		boolean teste = false;
		boolean teste2 = false;
		boolean teste3 = false;
		boolean teste4 = false;
		for(int linhaNova = 0; linhaNova < 2; linhaNova++) {
			for(int colunaNova = 0; colunaNova < 2; colunaNova++) {
				novaMatriz[linhaNova][colunaNova] = matriz[colunaNova][linhaNova];
				System.out.print("["+novaMatriz[linhaNova][colunaNova]+"]");
					if(matriz[0][0] == novaMatriz[0][0]) {
						teste = true;
					}
					if(matriz[1][0] == novaMatriz[1][0]) {
						teste2 = true;
					}
					if(matriz[0][1] == novaMatriz[0][1]) {
						teste3 = true;
					}
					   if(matriz[1][1] == novaMatriz[1][1]) {
						teste4 = true;
					}
			}
			System.out.println();
		}
		if(teste == true && teste2 == true && teste3 == true && teste4 ==  true) {
			System.out.println("As matrizes são Iguais");
		}
		System.out.println("O determinante da Matriz é : " + determinante);	
}
}