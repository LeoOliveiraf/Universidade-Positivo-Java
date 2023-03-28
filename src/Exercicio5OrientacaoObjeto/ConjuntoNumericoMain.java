package Exercicio5OrientacaoObjeto;

import java.util.Scanner;

public class ConjuntoNumericoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um Numero: ");
		Integer numero = input.nextInt();
		ConjuntoNumerico conjunto = new ConjuntoNumerico();
		conjunto.adicionar(numero);
		conjunto.busca(numero);
		conjunto.tamanho();
		conjunto.imprime();
		conjunto.remover(numero);
		}
	}


