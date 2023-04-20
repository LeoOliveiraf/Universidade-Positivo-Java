package treinoParaProvaPoo;

public class Contador {
	private Integer cont;
	
	public Contador() {
		
	}
	public Contador(Integer cont) {
		this.cont = cont;
	}
	public Integer getCont() {
		return cont;
	}
	public void setCont(Integer cont) {
		this.cont = cont;
	}
	
	public Integer zero() {
		return this.cont = 0;
	}
	public Integer incrementar() {
		return this.cont += 1;
	}
	public Integer decrementar() {
		return this.cont -= 1;
	}
	public Integer soma(Integer soma) {
		Integer s = getCont()  + soma;
		setCont(s);
		return s;
	}
	
	public Integer subtra(Integer sub) {
		Integer subtracao =  getCont() - sub;
		setCont(subtracao);
		return subtracao;
	}
}
