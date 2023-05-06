package treinoAbstract;

import java.util.ArrayList;

public class RefeicoesDiarias {
	private String dataRefeicaoDiari;
	private ArrayList<Refeicao> refeicoes;
	
	
	public RefeicoesDiarias() {
		refeicoes = new ArrayList<Refeicao>();
	}


	public RefeicoesDiarias(String dataRefeicaoDiari, ArrayList<Refeicao> refeicoes) {
		super();
		this.dataRefeicaoDiari = dataRefeicaoDiari;
		this.refeicoes = refeicoes;
	}


	public String getDataRefeicaoDiari() {
		return dataRefeicaoDiari;
	}


	public void setDataRefeicaoDiari(String dataRefeicaoDiari) {
		this.dataRefeicaoDiari = dataRefeicaoDiari;
	}


	public ArrayList<Refeicao> getRefeicoes() {
		return refeicoes;
	}


	public void setRefeicoes(ArrayList<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}
	
	public void adicionarRefeicao(Refeicao ref1) {
		refeicoes.add(ref1);
		System.out.println("Refeição Adicionada!");
	}
	
	public void removeRefeicao(String data, int hora, String nomeCliente) {
		boolean achou = false;
		for(int i = 0; i < refeicoes.size(); i++) {
			if(refeicoes.get(i).getData().equals(data) && refeicoes.get(i).getNomeCliente().equals(nomeCliente) && refeicoes.get(i).getHora() == hora) {
				achou = true;
				refeicoes.remove(i);
			}
		}
		
		if(!achou) {
			System.out.println("A refeição não está na lista!");
		}else {
			System.out.println("Refeição Removida!");
		}
	}
	
	public int qtdVendidaDia() { 
		return refeicoes.size();
	}
	
	public int qtdRefeicoesPor(String nomecliente) {
		int qtdPrato = 0;
		for(int i  = 0; i < refeicoes.size(); i++) {
			if(refeicoes.get(i).getNomeCliente().equals(nomecliente)) {
				if(refeicoes.get(i) instanceof PratoFeito) {
					qtdPrato++;
				}else if(refeicoes.get(i) instanceof Buffet) {
					qtdPrato++;
				}
			}
		}
		return qtdPrato;
	}
	
	public double valorTotalVendido() {
		double soma = 0;
		for(int i = 0; i < refeicoes.size(); i++) {
			soma += refeicoes.get(i).valorRefeicao();
		}
		return soma;
	}
	
	public double valorTotalPratoFeito() {
		double soma = 0;
		for(int i = 0; i < refeicoes.size(); i++) {
			if(refeicoes.get(i) instanceof PratoFeito) {
				soma += refeicoes.get(i).valorRefeicao();
			}
		}
		return soma;
	}
	
	public int qtdBuffets(int hora) {
		int contador = 0;
		for(int i = 0; i < refeicoes.size(); i++) {
			if(refeicoes.get(i).getHora() == hora) {
				if(refeicoes.get(i) instanceof Buffet) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public void imprime() {
		System.out.println("Data: " + dataRefeicaoDiari);
		for(int i = 0; i < refeicoes.size(); i++) {
			System.out.println(refeicoes.get(i).toString());
		}
		System.out.println("Valor Total Dia: " + valorTotalVendido());
	}
}
