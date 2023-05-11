package treinoAbstract;

public class Predio implements EmissaoCarbono{
	private int numeroPessoas;
	private boolean usoEnergia;
	private int numeroLampadas;
	private int numeroArCondi;
	
	
	public Predio() {
		super();
	}
	public Predio(int numeroPessoas, boolean usoEnergia, int numeroLampadas, int numeroArCondi) {
		super();
		this.numeroPessoas = numeroPessoas;
		this.usoEnergia = usoEnergia;
		this.numeroLampadas = numeroLampadas;
		this.numeroArCondi = numeroArCondi;
	}
	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	public boolean isUsoEnergia() {
		return usoEnergia;
	}
	public void setUsoEnergia(boolean usoEnergia) {
		this.usoEnergia = usoEnergia;
	}
	public int getNumeroLampadas() {
		return numeroLampadas;
	}
	public void setNumeroLampadas(int numeroLampadas) {
		this.numeroLampadas = numeroLampadas;
	}
	public int getNumeroArCondi() {
		return numeroArCondi;
	}
	public void setNumeroArCondi(int numeroArCondi) {
		this.numeroArCondi = numeroArCondi;
	}
	@Override
	public double quantidadeEmitida() {
		double calculo = 0;
		calculo = (14.4 * this.numeroLampadas) + 
				(10 * this.numeroPessoas) + (100 * this.numeroArCondi);
		
		if(this.usoEnergia == true) {
			double resultado = calculo / 2;
			return resultado;
		}
		return calculo;
		
	}
	
	
}
