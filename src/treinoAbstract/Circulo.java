package treinoAbstract;

public class Circulo extends Forma{
	private double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return (raio * raio) * 3.14;
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}
	
	public String toString() {
		return "Raio: " + raio;
	}
}
