package listaJavaOop;

import java.util.ArrayList;

public class FilaDeEspera {
	private ArrayList<String> fila;
	
	
	public FilaDeEspera() {
		fila = new ArrayList<String>();
	}


	public FilaDeEspera(ArrayList<String> fila) {
		super();
		this.fila = fila;
	}


	public ArrayList<String> getFila() {
		return fila;
	}


	public void setFila(ArrayList<String> fila) {
		this.fila = fila;
	}
	
	public void addPaciente(String nome) {
		for(int i = 0; i < fila.size(); i++) {
			if(fila.get(i).equals(nome)) {
				System.out.println("Pessoa Já Adicionada");
			}else {
				fila.add(nome);
			}
		}
	}
	
	public void atender(String nome) {
		for(int i = 0; i < fila.size();i++) {
			if(fila.get(i).equals(nome)) {
				System.out.println("Paciente Atendido");
				fila.remove(i);
				break;
			}else {
				System.out.println("Paciente deve agaurdar nao chegou a vez");
			}
		}
	}
	
	public void desistencia(String nome) {
		for(int i = 0; i < fila.size(); i++) {
			if(fila.get(i).equals(nome)) {
				fila.remove(i);
				System.out.println("Removido com Sucesso");
			}
		}
	}
	public void posicao(String nome) {
		for(int i = 0; i < fila.size();i++) {
			if(fila.get(i).equals(nome)) {
				System.out.println("Posicao: " + i);
			}
		}
	}
	public void tamanho() {
		System.out.println("Tamanho: " + fila.size());
	}
	public String imprime() {
		String str = "";
		for(int i = 0; i < fila.size(); i++) {
			str += fila.get(i) + "\n";
		}
		return str;
	}
}
