package ExercicioOrientacao;

import java.util.Scanner;

public class Treino20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] valores = new Integer[10];
		Integer number = 0;
		int i;
		for(i=0; i < valores.length; i++) {
			System.out.println("Digite um Valor: ");
			number = input.nextInt();
			valores[i] = number;
		}
		System.out.println("Number de Busca: ");
		Integer busca = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(valores[i] == busca) {
				System.out.println("Valor Encontrado");
				System.out.println("Posicao Vetor: ["+i+"]");
				break;
			}else {
				System.out.println("Numero nao Encontrado!");
			}
		}
	}
}
