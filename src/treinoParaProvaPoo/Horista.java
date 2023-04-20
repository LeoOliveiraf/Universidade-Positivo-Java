package treinoParaProvaPoo;

public class Horista extends Empregado{
	private Integer qtdHora;
	private double valorHora;
	
	public Horista() {
		super();
	}
	
	public Horista(Integer qtdHora, double valorHora) {
		super();
		this.qtdHora = qtdHora;
		this.valorHora = valorHora;
	}

	public Integer getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(Integer qtdHora) {
		this.qtdHora = qtdHora;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public String toString() {
		return super.toString() + " Qtd Hora: " + qtdHora + "\n" + 
									"Valor Hora: " + valorHora;
	}
	
}
