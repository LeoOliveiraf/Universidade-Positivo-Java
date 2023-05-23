package collections;

public class ExcecaoContaCollections extends Exception {
	private double valor;
	
	public ExcecaoContaCollections() {
		
	}
	public ExcecaoContaCollections(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "O valor é maior que o Saldo " + "\n" + 
					"Saldo: " + valor;
	}
}
