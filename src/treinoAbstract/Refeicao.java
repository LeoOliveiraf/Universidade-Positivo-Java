package treinoAbstract;

public abstract class Refeicao {
	private String data;
	private int hora;
	private String nomeCliente;
	private double preco;
	
	
	public Refeicao() {
		super();
	}


	public Refeicao(String data, int hora, String nomeCliente, double preco) {
		super();
		this.data = data;
		this.hora = hora;
		this.nomeCliente = nomeCliente;
		this.preco = preco;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double valorRefeicao() {
		return this.preco;
	}
	
	public String toString() {
		return "\n"+"Data Refeição: " + data + "\n"
				+ "Hora Refeição: " + hora + "\n"
				+ "Cliente: " + nomeCliente + "\n"
				+ "Preço: " + preco + "\n";
	}
}
