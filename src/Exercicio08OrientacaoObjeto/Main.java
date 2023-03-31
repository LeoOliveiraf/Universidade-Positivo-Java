package Exercicio08OrientacaoObjeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogador jogador1 = new Jogador("Leonardo", 7, "Leo", 2, true);
		Jogador jogador2 = new Jogador("Guilherme", 10, "Gui", 5, false);
		Jogador jogador3 = new Jogador("Pedro", 23, "Pedrao", 0, false);
		Jogador jogador4 = new Jogador("Vitor", 9, "Vitao", 10, true);
		Jogador jogador5 = new Jogador("Daniel", 11, "Dan", 0, false);
		
		System.out.println("Informe o nome para Remover: ");
		String nome = input.nextLine();
		
		Time time = new Time();
		
		time.adicionar(jogador1);
		time.adicionar(jogador2);
		time.adicionar(jogador3);
		time.adicionar(jogador4);
		time.adicionar(jogador5);
		time.suspensos();
		time.catoes();
		time.qtdJogador();
		time.remover(nome);
		time.qtdJogador();
	}
}
