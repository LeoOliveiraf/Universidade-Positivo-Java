package treinoParaProvaPoo;

public class Assalariado extends Empregado{
	private double salario;
	
	public Assalariado() {
		super();
	}

	public Assalariado(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + " Salario: " + salario;
	}
	
}
