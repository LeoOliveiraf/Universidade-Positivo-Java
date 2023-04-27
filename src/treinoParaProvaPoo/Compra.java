package treinoParaProvaPoo;

import java.util.ArrayList;

public class Compra {
	private String nomeCliente;
	private ArrayList<Produto> carrinho;
	
	public Compra() {
		carrinho = new ArrayList<Produto>();
	}

	public Compra(String nomeCliente, ArrayList<Produto> carrinho) {
		super();
		this.nomeCliente = nomeCliente;
		this.carrinho = carrinho;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void addCarrinho(Produto produto) {
		carrinho.add(produto);
		System.out.println("Add com Sucesso");
	}
	
	public void remover(Integer identificador) {
		
		
		for(int i = 0; i < carrinho.size(); i++) {
			if(carrinho.get(i).getIdentificador() == identificador) {
				carrinho.remove(i);
				System.out.println("Removido");
			}else {
				System.out.println("Produto Não está na Lista");
			}
		}
	}
	
	public Integer quantidadeProdutos() {
		return carrinho.size();
	}
	
	public double totalCompra() {
		double soma = 0;
		for(int i = 0; i < carrinho.size(); i++) {
			soma += carrinho.get(i).valorPag();
		}
		return soma;
	}
	
	public void qtdProdutoUnico() {
		ArrayList<Produto> unicos = new ArrayList<Produto>();
		boolean achou = false;
		for(int i = 0; i < carrinho.size(); i++) {
			for(int j = 0; j < unicos.size(); j++) {
				if(carrinho.get(i).getNome().contains(unicos.get(j).getNome())) {
					achou = true;
				}
			}
			if(achou != true) {
				unicos.add(carrinho.get(i));
				
			}
		}
		System.out.println("Produtos Unicos " + unicos.size());
	
	
		
	}
	
	public void imprimeLista() {
		String str = "";
		double preco = 0;
		System.out.println("Cliente: " + this.nomeCliente);
		for(int i = 0; i < carrinho.size(); i++) {
			System.out.println(carrinho.get(i).getNome());
			System.out.println(carrinho.get(i).getPreco());
		}
		System.out.println("Valor Total Compra: " + totalCompra());
	}
}
