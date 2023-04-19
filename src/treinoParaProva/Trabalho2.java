package treinoParaProva;

public class Trabalho2 {
	private double preco;
	private int qtd;
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double estoque() {
		double total = this.qtd * this.preco;
		return total;
	}
	public int diminui(int quanti) {
		int dimi = getQtd() - quanti;
		setQtd(dimi);
		return dimi;
	}
	public int aumenta(int aum) {
		int aume = getQtd() + aum;
		setQtd(aume);
		return aume;
	}
}
