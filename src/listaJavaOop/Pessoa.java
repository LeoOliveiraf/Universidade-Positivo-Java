package listaJavaOop;

public class Pessoa {
	private String nome;
	private String endereco;
	private double renda;
	public Pessoa(String nome, String endereco, double renda) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.renda = renda;
	}
	public Pessoa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public double calculaImp() {
		return this.renda * 0.1;
	}
}
