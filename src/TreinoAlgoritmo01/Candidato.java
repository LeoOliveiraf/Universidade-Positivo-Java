package TreinoAlgoritmo01;


//GUILHERME FRIAS, LEONARDO OLIVEIRA, VICTOR MOTA

public class Candidato {
	
	private String nome;
	private String cpf;
	String[] lista = new String[10];
	
	public Candidato() {
	}
	
	public Candidato(String nome, String cpf, String[] lista) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.lista = lista;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] lista) {
		this.lista = lista;
	}
	
	

}