package treinoParaProva;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		String nome = null;
		
		do {
			System.out.println("Digite um Nome:");
			nome = input.nextLine();
			array.add(nome);
		}while(!nome.equals("Fim"));
		System.out.println("Digite um Nome de Busca:");
		String busca = input.nextLine();
		if(array.contains(busca)) {
			System.out.println("Nome na Posição: " + array.size());
		}else {
			System.out.println("Nome nao encontrado");
		}
		
		System.out.println("Solicite um Nome Remover:");
		String remove = input.nextLine();
		if(array.contains(remove)) {
			array.remove(remove);
			System.out.println("Removido com Sucesso!");
		}else {
			System.out.println("Nome Não Encontrado");
		}
	}

}
