package treinoParaProvaPoo;

public class ProdutoEletronico extends Produto{
	private double imposto;

	public ProdutoEletronico() {
		super();
	}


	public ProdutoEletronico(Integer identificador, String nome, double preco, Integer quantidadeEstoque,double imposto) {
		super(identificador, nome, preco, quantidadeEstoque);
		this.imposto = imposto;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double valorPag() {
		double soma =  getPreco() * (imposto/100);
		return getPreco() + soma;
	}
}
