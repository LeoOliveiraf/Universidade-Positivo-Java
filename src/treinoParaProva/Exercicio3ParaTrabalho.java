package treinoParaProva;

public class Exercicio3ParaTrabalho {
	private Integer identificador;
	private String nome;
	private double preco;
	private Integer quantidade;
	
	
	public Exercicio3ParaTrabalho() {
		
	}

	public Exercicio3ParaTrabalho(Integer identificador, String nome, double preco, Integer quantidade) {
		this.identificador = identificador;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	public void vende(Integer vende) {
		this.quantidade -= vende;
		System.out.println(this.quantidade);
	}
	
	public void estocaProduto(Integer estocaProduto) {
		this.quantidade += estocaProduto;
		System.out.println(this.quantidade);
	}
	
	public void totalEstoque() {
		double valorTotal = getQuantidade() * getPreco() ;
		System.out.println("Valor total do Estoque desse Produto é: R$" + valorTotal);
	}
}
