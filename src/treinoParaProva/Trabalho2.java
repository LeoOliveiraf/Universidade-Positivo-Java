package treinoParaProva;

public class Trabalho2 {
	private double preco;
	private Integer quantidade;
	
	public Trabalho2() {
		
	}
	public Trabalho2(double preco, Integer quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	 public double totalEstoque() {
		 double total = getQuantidade() * getPreco();
		 System.out.println(total);
		 return total;
	}
	 
	 public void diminuiEstoque(Integer qtdDiminui) {
		 Integer diminui = getQuantidade() - qtdDiminui;
		 setQuantidade(diminui);
		 System.out.println(diminui);
	 }
	 
	 public void aumentaEstoque(Integer qtdAumenta) {
		 Integer aumenta = getQuantidade() + qtdAumenta;
		 setQuantidade(aumenta);
		 System.out.println(aumenta);
	 }
}
