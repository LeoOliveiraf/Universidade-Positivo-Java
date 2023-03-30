package Exercicio6OrientacaoObjeto;

import java.util.Scanner;

public class ClasseMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a Data: ");
		String dataCorrida = input.nextLine();
		System.out.println("Digite a Hora: ");
		String horaCorrida = input.nextLine();
		Corrida corrida = new Corrida();
		corrida.setDataCorrida(dataCorrida);
		corrida.setHoraCorrida(horaCorrida);
		corrida.DataHora(dataCorrida, horaCorrida);
	}
}
