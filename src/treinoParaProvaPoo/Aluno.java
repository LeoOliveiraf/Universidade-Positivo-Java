package treinoParaProvaPoo;

public class Aluno {
	private String nome;
	private int registro;
	private double mensalidade;
	
	
	public Aluno() {
		super();
	}


	public Aluno(String nome, int registro, double mensalidade) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.mensalidade = mensalidade;
	}


	public double getMensalidade() {
		return mensalidade;
	}


	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public double pagarM(int dia) {
		
		if(dia <= 5) {
			return mensalidade  - mensalidade*(0.05);
		}
		if(dia >= 10) {
			return mensalidade + mensalidade*0.1;
		}
		return mensalidade;
		
	}
}
