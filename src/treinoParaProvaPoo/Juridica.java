package treinoParaProvaPoo;

public class Juridica extends Pessoa{
	private String cnpj;

	
	public Juridica(String nome, String endereco, double renda,String cnpj) {
		super(nome, endereco, renda);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {
		return super.toString() + " Cnpj: " + cnpj;
	}
}
