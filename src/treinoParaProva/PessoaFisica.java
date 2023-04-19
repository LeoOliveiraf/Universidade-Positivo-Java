package treinoParaProva;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String endereco, double renda,String cpf) {
		super(nome, endereco, renda);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 
	public double calculaImposto() {
		if(getRenda() > 0 && getRenda() <= 1400) {
				return  0;
		}
		else if(getRenda() > 1400 && getRenda() <= 2100) {
				double imposto = getRenda() * (10/100) - 100;
				return imposto;
		}else if(getRenda() > 2100 && getRenda() <= 2800) {
			double imposto = getRenda() * (15/100) - 270;
			return imposto;
		}else if(getRenda() > 2800 && getRenda() <= 3600) {
			double imposto = getRenda() * (25/100) - 500;
			return imposto;
		}else if(getRenda() > 3600) {
			double imposto = getRenda() * (30/100) - 700;
			return imposto;
		}
		return -1;
	}
	
	public String toString() {
		return super.toString() + "CPF" + cpf;
	}
}
