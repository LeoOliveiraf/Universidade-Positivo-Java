package collections;

public class Pessoa implements Comparable<Pessoa>{
	private String name;
	private String cpf;
	private String dataNascimento;
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(String name, String cpf, String dataNascimento) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return  "Nome: " + name + "\n" +
				"Cpf: " + cpf + "\n" + 
				"Nascimento: " + dataNascimento;
	}
	@Override
	public int compareTo(Pessoa o) {
		return this.name.compareToIgnoreCase(o.name);
	}
}
