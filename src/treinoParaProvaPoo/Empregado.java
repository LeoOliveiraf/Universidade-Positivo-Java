package treinoParaProvaPoo;

public class Empregado {
	private String nome;
	private String cpf;
	private String setor;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String cpf, String setor) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + 
				"CPF: " + cpf + "\n" + 
				"Setor: " + setor;
	}
}
