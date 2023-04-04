package HerancaOOPExercicios;

public class Novo extends Imovel{
	private double porcentagem;

	public Novo() {
		
	}
	public Novo(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public void novoImovel() {
		double valor = (porcentagem / 100) * this.getPreco();
		valor = valor + this.getPreco();
		System.out.println("Valor Imovel Novo: " + valor);
	}
	
	public String imprime() {
		String str = dadosImovel() + "\nPorcentagem: " + porcentagem;
		return str;
	}
}