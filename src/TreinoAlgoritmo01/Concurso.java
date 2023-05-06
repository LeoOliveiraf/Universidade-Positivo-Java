package TreinoAlgoritmo01;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
	

	//GUILHERME FRIAS, LEONARDO OLIVEIRA, VICTOR MOTA
		private String[] listaConcurso = new String[] {"a","b","c","d","e","a","b","c","d","e"};
		private List<Candidato> listaCandidatos;
		
		public Concurso() {
			listaCandidatos= new ArrayList<Candidato>();
		}
		
		public Concurso(String[] listaConcurso, List<Candidato> listaCandidatos) {
			super();
			this.listaConcurso = listaConcurso;
			this.listaCandidatos = listaCandidatos;
		}
		
		public String[] getListaConcurso() {
			return listaConcurso;
		}
		public void setListaConcurso(String[] listaConcurso) {
			this.listaConcurso = listaConcurso;
		}
		public List<Candidato> getListaCandidatos() {
			return listaCandidatos;
		}
		public void setListaCandidatos(List<Candidato> listaCandidatos) {
			this.listaCandidatos = listaCandidatos;
		}
		
		public void addCandidato(Candidato cand) {
			for(int i = 0; i < listaCandidatos.size(); i++) {
				if(!listaCandidatos.get(i).getCpf().equals(cand.getCpf())) {
					listaCandidatos.add(cand);
				}
			}
		}
		
		public void removeCandidato(String cpf) {
			for(int i = 0; i < listaCandidatos.size(); i++) {
				if(listaCandidatos.get(i).getCpf().equals(cpf)) {
					listaCandidatos.remove(i);
				}
			}
		}
		
		public void addRespostas(String resposta) {	
			Candidato cand = new Candidato();
			boolean achou = false;
			for(int i = 0; i < 10; i++) {
				if(resposta == "a" || resposta == "b" || resposta == "c" || resposta == "d" || resposta == "e") {
					achou = true;
					cand.lista[i] = resposta;
					System.out.println(cand.lista[i]);
				}
			}
			if(!achou) {
				System.out.println("Resposta incorreta!");
			}else {
				System.out.println("Armazenado");
			}
		}
		
		public Integer corrigirProva(Candidato cand, String lista[]) {
			Integer contador = 0;
			for(int i = 0; i < listaCandidatos.size(); i++) {
				if(lista[i] == cand.lista[i]) {
					contador++;
				}
			}
			return contador;
		}
		
		

	}

