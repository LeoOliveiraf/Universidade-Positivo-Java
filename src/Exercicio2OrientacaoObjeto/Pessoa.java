package Exercicio2OrientacaoObjeto;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String sexo;
	
	public void fazerAniver() {
		this.idade++;
	}
	public Pessoa(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
