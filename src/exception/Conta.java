package exception;

public class Conta {
	private double valorSaldo;
	
	public Conta() {
		super();
	}

	public Conta(double valorSaldo) {
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
	public double sacar(double valor) throws ExcecaoConta{
		if(valorSaldo >= valor) {
			this.valorSaldo -= valor;
			System.out.println("Valor sacado!");
		}else {
			throw new ExcecaoConta(valorSaldo);
		}
		return -1;
	}
	
}
