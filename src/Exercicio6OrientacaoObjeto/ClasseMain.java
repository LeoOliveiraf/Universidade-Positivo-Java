package Exercicio6OrientacaoObjeto;

import java.util.Scanner;

public class ClasseMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a Data: ");
		String data = input.nextLine();
		System.out.println("Digite a Hora: ");
		String hora = input.nextLine();
		System.out.println("Digite a Idade: ");
		Integer idade = input.nextInt();
		
		Participante corredo1 = new Participante("Leo", 22, 75, 1.75);
		Participante corredo2 = new Participante("Vitor", 23, 85, 1.75);
		Participante corredo3 = new Participante("Gui", 28, 90,1.75);
		Participante corredo4 = new Participante("Maria", 21, 100, 1.75);
		Participante corredo5 = new Participante("Lucas", 24, 20, 1.75);
		
		Corrida corrida = new Corrida();
		corrida.dataHora(data, hora);
		corrida.adicionar(corredo1);
		corrida.adicionar(corredo2);
		corrida.adicionar(corredo3);
		corrida.adicionar(corredo4);
		corrida.adicionar(corredo5);
		corrida.idade(idade);
		corrida.imc();
		corrida.remover(corredo1);
	}
}
