package treinoParaProva;

public class Gerente extends Funcionario{
	private String setor;

	public Gerente(String nome, String cpf, double salario,String setor) {
		super(nome, cpf, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public double bonifica() {
		return this.getSalario() * 0.15;
	}
}
