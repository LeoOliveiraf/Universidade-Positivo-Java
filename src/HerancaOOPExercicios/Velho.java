package HerancaOOPExercicios;

public class Velho extends Imovel{
	private double descontPorcent;

	public Velho() {
		
	}
	public Velho(double descontPorcent) {
		this.descontPorcent = descontPorcent;
	}
	
	public double getDescontPorcent() {
		return descontPorcent;
	}
	public void setDescontPorcent(double descontPorcent) {
		this.descontPorcent = descontPorcent;
	}
	
	public void velhoImovel() {
		double desconto = (descontPorcent / 100) * this.getPreco();
		desconto = this.getPreco() - desconto;
		System.out.println("Valor Imovel Velho: " + desconto);
	}
	
	public String imprime() {
		String str = dadosImovel() + "\nDesconto Imovel: " + descontPorcent;
		return str;
	}
}
