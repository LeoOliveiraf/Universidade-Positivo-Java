package treinoParaProvaPoo;

public class ReceitaUni {
	private double totalRecebido;

	public ReceitaUni() {
		super();
	}

	public ReceitaUni(double totalRecebido) {
		super();
		this.totalRecebido = totalRecebido;
	}

	public double getTotalRecebido() {
		return totalRecebido;
	}

	public void setTotalRecebido(double totalRecebido) {
		this.totalRecebido = totalRecebido;
	}
	
	public double recebePag(Aluno aluno, int dia) {
		return aluno.pagarM(dia) + totalRecebido;
	}
}
