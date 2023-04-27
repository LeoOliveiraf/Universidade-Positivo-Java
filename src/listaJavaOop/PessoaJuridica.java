package listaJavaOop;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, double renda,String cnpj) {
		super(nome, endereco, renda);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
