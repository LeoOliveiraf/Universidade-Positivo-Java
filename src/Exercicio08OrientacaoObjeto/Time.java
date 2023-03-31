package Exercicio08OrientacaoObjeto;

import java.util.ArrayList;

public class Time {
	private String nome;
	private ArrayList<Jogador> listaJo = new ArrayList<Jogador>();
	private Jogador jogador;
	
	public Time() {
		
	}
	public Time(String nome, ArrayList<Jogador> listaJo, Jogador jogador) {
		this.nome = nome;
		this.listaJo = listaJo;
		this.jogador = jogador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getListaJo() {
		return listaJo;
	}
	public void setListaJo(ArrayList<Jogador> listaJo) {
		this.listaJo = listaJo;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public Jogador adicionar(Jogador jogadores) {
		if(listaJo.contains(jogadores)) {
			System.out.println("Jogador ja faz parte do time");
		}else {
			listaJo.add(jogadores);
		}
		return jogadores;
	}
	public void suspensos() {
		int contador = 0;
		for(Jogador itens : listaJo) {
			if(itens.isSuspenso() == true) {
				contador++;
			}
		}
		System.out.println("Jogadores Suspensos: " + contador);
	}
	public void catoes() {
		int soma = 0;
		for(Jogador cartao : listaJo) {
			soma += cartao.getCartoes();
		}
		System.out.println("Qtd de Cartoes: " + soma);
	}
	public void qtdJogador() {
		System.out.println("Total de Jogadores: " + listaJo.size());
	}
	public void remover(String jogadorRemov) {
		for(Jogador itens : listaJo) {
			if(itens.getNome().equals(jogadorRemov)) {
				System.out.println("Jogador Removido: " + listaJo.remove(itens));
			}
		}
	}
}
