package treinoParaProva;

public class Trabalho3 {
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Trabalho3() {
		
	}
	public Trabalho3(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota3() {
		return nota3;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double media() {
		double media = (nota1 * 2.5) + (nota2 * 2.5) + (nota3 * 2);
		double total = media / 7;
		return total;
	}
	
	public int situacao() {
		if(media() >= 6) {
			return 1;		
	}
	
	if(media() >= 4 && media() <= 5.9) {
		return 2;
	}
	return 3;
}
}
