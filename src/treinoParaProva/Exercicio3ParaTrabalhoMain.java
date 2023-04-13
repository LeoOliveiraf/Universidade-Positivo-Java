package treinoParaProva;

import java.util.Scanner;

public class Exercicio3ParaTrabalhoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Exercicio3ParaTrabalho produtos = new Exercicio3ParaTrabalho();
		produtos.setIdentificador(1);
		produtos.setNome("Perfume");
		produtos.setPreco(50);
		Integer qtdEstoca = 0;
		Integer opcao = 0;
		while(opcao != -1) {
			System.out.println("1-Estocar Produto");
			System.out.println("2-Vender Produto");
			System.out.println("3-Consultar Estoque");
			Integer loja = input.nextInt();
			switch(loja) {
			case 1:{
				System.out.println("Quantidade para Estocar:");
				qtdEstoca = input.nextInt();
				produtos.estocaProduto(qtdEstoca);
				break;
			}
			case 2:{
				System.out.println("Quantidade de Compra:");
				Integer vende = input.nextInt();
				produtos.vende(vende, qtdEstoca);
				break;
			}
			case 3:{
				produtos.totalEstoque();
				break;
			}
			}
		}
	}
}
