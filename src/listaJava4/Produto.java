package listaJava4;

public class Produto {
	private String nome;
	private double valorUnitario;
	private int quantidade;
	
	public Produto() {
		super();
	}
	public Produto(String nome, double valorUnitario, int quantidade) {
		super();
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
