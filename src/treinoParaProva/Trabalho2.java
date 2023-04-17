package treinoParaProva;

public class Trabalho2 {
	private double preco;
	private int qtd;
	
	public Trabalho2() {
		
	}
	
	public Trabalho2(double preco, int qtd) {
		this.preco = preco;
		this.qtd = qtd;
	}
	
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
	
	public int diminui(int quantidade) {
		int diminui = getQtd() - quantidade;
		setQtd(diminui);
		return diminui;
	}
	
	public int aumenta(int quantidade) {
		int aumenta = getQtd() + quantidade;
		setQtd(aumenta);
		return aumenta;
	}
}
