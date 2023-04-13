package treinoParaProva;

import java.util.Scanner;

public class Exercicio3ParaTrabalhoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Exercicio3ParaTrabalho produtos = new Exercicio3ParaTrabalho();
		produtos.setIdentificador(1);
		produtos.setNome("Perfume");
		produtos.setPreco(50);
		produtos.setQuantidade(10);
		Integer estocaProduto = 5;
		produtos.estocaProduto(estocaProduto);
		produtos.totalEstoque();
		Integer vende = 3;
		produtos.vende(vende);
		produtos.totalEstoque();
		
		
		
		
	}
}
