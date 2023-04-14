package treinoParaProva;

public class Trabalho3 {
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho;
	
	
	public Trabalho3() {
		
	}

	public Trabalho3(double notaProva1, double notaProva2,
			double notaTrabalho) {
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}
	public double getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public double getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public double mediaPonderada() {
		double media = (this.notaProva1 * 2.5) + (this.notaProva2 * 2.5) + (this.notaTrabalho * 2); 
		double MediaFinal = media / 7;
		return MediaFinal;
	}
	
	public int situacaoAluno() {
		if(mediaPonderada() >= 6) {
			return 1;
		}
		if(mediaPonderada() >= 4 && mediaPonderada() <= 5.9) {
			return 2;
		}
		return 3;
	}
		
}
