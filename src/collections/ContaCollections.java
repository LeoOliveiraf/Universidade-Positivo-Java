package collections;

public class ContaCollections {
	private double valorSaldo;
	
	public ContaCollections() {
		super();
	}

	public ContaCollections(double valorSaldo) {
		super();
		this.valorSaldo = valorSaldo;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	
	public double depositar(double valor) {
		return this.valorSaldo += valor;
	}
	public double sacar(double valor) throws ExcecaoContaCollections{
		if(valorSaldo >= valor) {
			this.valorSaldo -= valor;
			System.out.println("Valor sacado!");
		}else {
			throw new ExcecaoContaCollections(valorSaldo);
		}
		return -1;
	}
	
}
