package treinoAbstract;

public class Buffet extends Refeicao{
	private double peso;

	
	public Buffet() {
		super();
	}


	public Buffet(String data, int hora, String nomeCliente, double preco,double peso) {
		super(data, hora, nomeCliente, preco);
		this.peso = peso;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double valorRefeicao() {
		return getPreco() * peso;
	}
	
	public String toString() {
		return super.toString() + "Peso: " + peso;
	}
}
