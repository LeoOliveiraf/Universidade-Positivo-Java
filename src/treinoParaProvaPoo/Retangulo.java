package treinoParaProvaPoo;

public class Retangulo {
	private int lado1;
	private int lado2;
	
	public Retangulo() {
		
	}
	
	public Retangulo(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public double area() {
		double cArea = this.lado1 * lado2;
		return cArea;
	}
	
	public double perimetro() {
		double cPerimetro = 2 * (this.lado1 + this.lado2);
		return cPerimetro;
	}
}
