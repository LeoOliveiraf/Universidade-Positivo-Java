package treinoParaProvaPoo;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Melão", 7, 20);
		Produto p2 = new Produto(2, "Pera", 10, 12);
		Produto p3 = new Produto(3, "Maça", 5, 30);
		ProdutoEletronico pe1 = new ProdutoEletronico(1, "Celular", 1000, 10, 10);
		ProdutoEletronico pe2 = new ProdutoEletronico(4, "Tablet", 500, 5, 15);
		Produto p4 = new Produto(3, "Maça", 5, 30);
		
		Compra compra = new Compra();
		compra.setNomeCliente("Guilherme");
		compra.addCarrinho(p1);
		compra.addCarrinho(p2);
		compra.addCarrinho(p3);
		compra.addCarrinho(pe1);
		compra.addCarrinho(pe2);
		compra.addCarrinho(p4);
		compra.remover(1);
		System.out.println(compra.quantidadeProdutos());
		System.out.println(compra.totalCompra());
		compra.qtdProdutoUnico();
	}

}
