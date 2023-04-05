package HerancaOOPExercicios;

public class PessoaAlunoProfessor {
	private String nome;
	private String cpf;
	private char sexo;
	
	public PessoaAlunoProfessor() {
		
	}
	
	public PessoaAlunoProfessor(String nome, String cpf, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String dadosPessoa() {
		String str = "Nome: " + nome + "\n"
				+"Cpf: " + cpf + "\n"
				+"Sexo: " + sexo;
		return str;
	}
}
