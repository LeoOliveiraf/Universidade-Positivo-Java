package projetoJava;

public abstract class Patient {
	private String nome;
	private String cpf;
	private int idade;
	private int diaConsulta;
	private double mensalidadeConsulta;
	
	public Patient() {
		super();
	}


	public Patient(String nome, String cpf, int idade, int diaConsulta, double mensalidadeConsulta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.diaConsulta = diaConsulta;
		this.mensalidadeConsulta = mensalidadeConsulta;
	}


	public int getDiaConsulta() {
		return diaConsulta;
	}


	public void setDiaConsulta(int diaConsulta) {
		this.diaConsulta = diaConsulta;
	}


	public double getMensalidadeConsulta() {
		return mensalidadeConsulta;
	}


	public void setMensalidadeConsulta(double mensalidadeConsulta) {
		this.mensalidadeConsulta = mensalidadeConsulta;
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getDataConsulta() {
		return diaConsulta;
	}


	public void setDataConsulta(int diaConsulta) {
		this.diaConsulta = diaConsulta;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n"
				+ "CPF: " + cpf + "\n"
				+ "Idade: " + idade + "\n"
				+ "Dia Consulta: " + diaConsulta + "\n"
				+ "Valor Mensalidade: " + mensalidadeConsulta + "\n";
	}
	
	public double descontoPaciente(double valor) {
		double desconto =  valor * 0.1;
		return valor - desconto;
		
	}
}
