package HerancaOOPExercicios;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		
	}

	public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public String dadosFornecedor() {
		String str = dadosPessoa() + "\nValorCredito: " + valorCredito + "\nValor Divida: " + valorDivida;
		return str;
	}
	
	public void obterSaldo() {
		double result = valorCredito - valorDivida;
		System.out.println("Saldo: " + result);
	}
}
