package Exercicio4OrientacaoObjeto;

public class Viagem {
	private int lugares[];
	
	public Viagem() {
		lugares = new int[100];
		inicializa();
	}
	
	public Viagem(int [] lugares) {
		this.lugares = lugares;
		inicializa();
	}
	
	private void inicializa() {
		for(int i = 0; i < 100; i++) {
			lugares[i] = -1;
		}
	}
	
	public int[] getLugares() {
		return lugares;
	}
	
	public void setLugares(int [] lugares) {
		this.lugares = lugares;
	}
	
	public int proximoLivre() {
		for(int i = 0; i < 100; i++) {
			if(lugares[i] == -1) {
				return i;
			}
		}
		return -1;
	}
	
	public void verificaPoltrona(int poltrona) {
		if(lugares[poltrona] == -1) {
			System.out.println("Poltrona livre!");
		}
		else {
			System.out.println("Poltrona ocupada!");
		}
	}
	
	public int reservaPoltrona() {
		int poltrona = proximoLivre();
		if(poltrona != -1) {
			lugares[poltrona] = 0;
		}
		return poltrona;		
	}
	
	public int quantidadePoltronasVazias() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if(lugares[i] == -1) {
				cont++;
			}
		}
		return cont;
	}
	
	public int quantidadePoltronasOcupadas() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if(lugares[i] == 0) {
				cont++;
			}
		}
		return cont;
	}
}
	
	