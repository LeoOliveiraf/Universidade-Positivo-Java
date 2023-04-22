package treinoParaProva;

public class Gastos {
	private double total = 0;
	
	public double getTotal() {
		return total;
	}
	
	public void adicionaBoni(Funcionario f) {
		total +=  f.bonifica();
	}
}
