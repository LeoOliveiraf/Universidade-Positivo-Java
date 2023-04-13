package treinoParaProva;

public class Exercicio3ParaTrabalho {
	private Integer identificador;
	private String nome;
	private double preco;
	private Integer quantidade;
	private Integer estoque = 0;
	
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
	
	
	
	public void vende(Integer vende, Integer qtdEstoca) {
		if(qtdEstoca >= vende) {
			estoque = qtdEstoca - vende;
			System.out.println("Estoque Atual: " + estoque);
		}else {
			System.out.println("Desculpe, estoque Insuficiente");
		}
	}
	
	public void estocaProduto(Integer estocaProduto) {
		estoque = estoque + estocaProduto;
		System.out.println("Estoque Atual: " + estoque);
	}
	
	public void totalEstoque() {
		double valorTotal = estoque * getPreco() ;
		System.out.println("Valor total do Estoque desse Produto é: R$" + valorTotal);
	}
}
