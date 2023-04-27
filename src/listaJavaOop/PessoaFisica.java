package listaJavaOop;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome, String endereco, double renda, String cpf) {
		super(nome, endereco, renda);
		this.cpf = cpf;
	}

	public PessoaFisica() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcula() {
		if(getRenda() > 0 && getRenda() <= 1400) {
			return 0;
		}
		if(getRenda() > 1400 && getRenda() <= 2100) {
			return getRenda() * (10/100) - 100;
		}
		if(getRenda() > 2100 && getRenda() <= 2800) {
			return getRenda() * (15/100) - 270;
		}
		if(getRenda() > 2800 && getRenda() < 3600) {
			return getRenda() * (25/100) - 500;
		}
		if(getRenda() >= 3600) {
			return getRenda() * (30/100) - 700;
		}
		return getRenda();
	}
}
