package treinoAbstract;

public class Bicicleta implements EmissaoCarbono{
	private double velocidade;
	private double distancia;
	
	
	public Bicicleta() {
		super();
	}
	public Bicicleta(double velocidade, double distancia) {
		super();
		this.velocidade = velocidade;
		this.distancia = distancia;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	@Override
	public double quantidadeEmitida() {
		return 0;
	}
	
	
}
