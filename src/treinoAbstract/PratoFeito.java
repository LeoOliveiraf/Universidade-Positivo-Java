package treinoAbstract;

public class PratoFeito extends Refeicao{
	private double valorServico;

	
	public PratoFeito() {
		super();
	}

	public PratoFeito(String data, int hora, String nomeCliente, double preco,double valorServico) {
		super(data, hora, nomeCliente, preco);
		this.valorServico = valorServico;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	public double valorRefeicao() {
		return getPreco() + valorServico;
	}
	
	public String toString() {
		return super.toString() + "Serviço: " + valorServico;
	}
}
