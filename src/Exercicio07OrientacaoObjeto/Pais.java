package Exercicio07OrientacaoObjeto;

import java.util.ArrayList;

public class Pais {
	private String codigo;
	private String nome;
	private Integer populacao;
	private double dimensao;
	private ArrayList<String> fronteira = new ArrayList<String>();
	
	public Pais() {
		
	}
	
	public Pais(String codigo, String nome, Integer populacao, double dimensao, ArrayList<String> fronteira) {
		this.codigo = codigo;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
		this.fronteira = fronteira;
	}
	
	public ArrayList<String> getFronteira() {
		return fronteira;
	}
	public void setFronteira(ArrayList<String> fronteira) {
		this.fronteira = fronteira;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Pais pais = (Pais) obj;
		return codigo == pais.codigo;
	}
	
	
	public String pFronteira(String nome) {
		if(fronteira.contains(nome)) {
			System.out.println("Sim, faz Fronteira!");
		}else {
			System.out.println("Não faz Fronteira");
		}
		return nome;
	}
	
	
}
