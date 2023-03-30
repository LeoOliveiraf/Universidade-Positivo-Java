package Exercicio5OrientacaoObjeto;

import java.util.Scanner;

public class ConjuntoNumericoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um Numero: ");
		Integer numero = 0;
		ConjuntoNumerico conjunto = new ConjuntoNumerico();
		do {
			numero = input.nextInt();
			conjunto.adicionar(numero);
		}while(numero != -1);
		conjunto.busca(numero);
		conjunto.tamanho();
		conjunto.imprime();
		conjunto.remover(numero);
		}
	}


