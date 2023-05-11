package treinoAbstract;

public class Carro implements EmissaoCarbono{
	private String combustivel;
	private double kmRodados;
	
	public Carro() {
		super();
	}

	public Carro(String combustivel, double kmRodados) {
		super();
		this.combustivel = combustivel;
		this.kmRodados = kmRodados;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}

	@Override
	public double quantidadeEmitida() {
		if(this.combustivel.equals("gasolina") || this.combustivel.equals("alcool")) {
			return 96 * this.kmRodados;
		}else if(this.combustivel.equals("eletrico")) {
			return 53 * this.kmRodados;
		}else if(this.combustivel.equals("diesel")) {
			return 171 * this.kmRodados;
		}
		return -1;
	}
	
	
}
