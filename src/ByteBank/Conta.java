package ByteBank;
 public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	//public Conta(double saldo, int agencia, int numero, String titular) {

		//this.saldo = saldo;
		//this.agencia = agencia;
		//this.numero = numero;
		//this.titular = titular;
	//}

	void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
}