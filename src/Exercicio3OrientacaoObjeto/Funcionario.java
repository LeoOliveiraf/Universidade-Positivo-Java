package Exercicio3OrientacaoObjeto;


public class Funcionario {
	private String nome;
	private String sobrenome;
	private double horas;
	private double valorHora;
	
	public Funcionario(){
		
	}
	public Funcionario(String nome, String sobrenome, double horas, double valorHora) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String nomeCompleto(String nomeCompleto) {
		if(nome.equals(sobrenome)) {
			System.out.println("Nome e Sobrenome Iguais!!");
		}else {
			nomeCompleto = nome.concat(sobrenome);
		}
		return nomeCompleto;
	}
	public double calcularSalario() {
		return horas * valorHora;
	}
	public double incrementarHora(double valor) {
		valor = valorHora + valor;
		return valor;
	}
	public double decrementarHora(double valor) {
		valor = valorHora - valor;
		return valor;
	}
	public double aumentaValorHora(double porcentagem) {
		porcentagem = porcentagem / 100;
		porcentagem = porcentagem * valorHora;
		double novoValorHora = porcentagem + valorHora;
		return novoValorHora;
	}
}
