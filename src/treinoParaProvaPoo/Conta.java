package treinoParaProvaPoo;

public class Conta {
	private String tipo;
	private Integer number;
	private String nome;
	private double saldo;
	
	public Conta() {
		super();
	}

	public Conta(String tipo, Integer number, String nome, double saldo) {
		super();
		this.tipo = tipo;
		this.number = number;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(double saque) {
		if(getSaldo() >= saque) {
			double sacado = getSaldo() - saque;
			setSaldo(sacado);
			return sacado;
		}
		return -1;
	}
	
	public double Depositar(double valor) {
		double deposi = getSaldo() + valor;
		setSaldo(deposi);
		return deposi;
	}
	
	public String toString() {
		return "Saldo: " + saldo + "\n" + 
				"Nome: " + nome + "\n" + 
				"Tipo Conta: " + tipo + "\n" + 
				"Numero Conta: " + number;
	}
	
}
