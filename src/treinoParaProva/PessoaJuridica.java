package treinoParaProva;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	
	public PessoaJuridica() {
		super();
	}


	public PessoaJuridica(String nome, String endereco, double renda,String cnpj) {
		super(nome, endereco, renda);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calculaImposto() {
		double imposto = getRenda() * 0.1;
		return imposto;
	}
	
	public String toString() {
		return super.toString() + "CNPJ" + cnpj;
	}
}
