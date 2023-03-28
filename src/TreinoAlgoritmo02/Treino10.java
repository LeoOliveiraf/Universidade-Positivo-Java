package TreinoAlgoritmo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> grama = new ArrayList<Integer>();
		double quantidadeInicio = 0;
		int contador = 0;
		double result = 0;
		double quantidadeFinal = 0;
		System.out.println("Informe um numero: ");
		quantidadeInicio = input.nextInt();
		quantidadeFinal = quantidadeInicio / 2;
		grama.add((int) quantidadeFinal);
		do {
			quantidadeFinal = quantidadeFinal/ 2;
			grama.add((int) quantidadeFinal);
			contador ++;
		}while(quantidadeFinal > 0.5);
		double segundos  = contador * 50;
		double minutos = segundos / 60;
		segundos %= 60;
		double hora = segundos / 3600;
		segundos %= 60;
		System.out.printf("\nQuantidade Inicio: " + quantidadeInicio);
		System.out.printf("\nHoras: %.1f", hora);
		System.out.printf("\nMinutos: %.1f", minutos);
		System.out.printf("\nSegundos: %.1f", segundos);
		System.out.printf("\nQuantidade Final: %.2f", quantidadeFinal);
					
	}
}
