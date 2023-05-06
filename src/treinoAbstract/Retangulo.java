package treinoAbstract;

public class Retangulo extends Forma{
	private double base;
	private double altura;
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public Retangulo() {
		super();
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}
	
	public String toString() {
		return "Base: " + base + "\n"
				+ "Altura: " + altura;
	}
}
