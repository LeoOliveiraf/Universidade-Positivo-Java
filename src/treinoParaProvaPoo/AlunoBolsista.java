package treinoParaProvaPoo;

public class AlunoBolsista extends Aluno{
	private double desconto;
	
	
public AlunoBolsista() {
		super();
	}


public AlunoBolsista(String nome, int registro, double mensalidade, double desconto) {
		super(nome, registro, mensalidade);
		this.desconto = desconto;
	}


public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


public double pagarM(int dia) {
	double total = 0;
		if(dia <= 15) {
			return getMensalidade() - getMensalidade() * (this.desconto/100);
		}
		return getMensalidade();
	}
}
