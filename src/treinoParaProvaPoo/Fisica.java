package treinoParaProvaPoo;

public class Fisica extends Pessoa{
	private String cpf;

	public Fisica(String nome, String endereco, double renda,String cpf) {
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
			return 0;
		}
		if(getRenda() > 1400 && getRenda() <= 2100) {
			return getRenda() * 0.1 - 100;
		}
		if(getRenda() > 2100 && getRenda() <= 2800) {
			return getRenda() * 0.15 - 270;
		}
		if(getRenda() > 2800 && getRenda() <= 3600) {
			return getRenda() * 0.25 - 500;
		}
		if(getRenda() > 3600) {
			return getRenda() * 0.3 - 700;
			
		}
		return getRenda();
		 
	}
	public String toString() {
		return super.toString() + " Cpf: " + cpf;
	}
}
