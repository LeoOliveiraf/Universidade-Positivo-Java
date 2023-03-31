package Exercicio08OrientacaoObjeto;

public class Jogador {
	private String nome;
	private Integer numero;
	private String apelido;
	private Integer cartoes;
	private boolean suspenso;
	
	public Jogador() {
		
	}
	public Jogador(String nome, Integer numero, String apelido, Integer cartoes, boolean suspenso) {
		this.nome = nome;
		this.numero = numero;
		this.apelido = apelido;
		this.cartoes = cartoes;
		this.suspenso = suspenso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Integer getCartoes() {
		return cartoes;
	}
	public void setCartoes(Integer cartoes) {
		this.cartoes = cartoes;
	}
	public Boolean isSuspenso() {
		return suspenso;
	}
	public void setSuspenso(Boolean suspenso) {
		this.suspenso = suspenso;
	}
	
}
