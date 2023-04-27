package treinoParaProvaPoo;

public class Produto {
	private Integer identificador;
	private String nome;
	private double preco;
	private Integer quantidadeEstoque;
	
	
	public Produto() {
		super();
	}


	public Produto(Integer identificador, String nome, double preco, Integer quantidadeEstoque) {
		super();
		this.identificador = identificador;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public Integer getIdentificador() {
		return identificador;
	}


	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public double valorPag() {
		return this.preco;
	}
}
