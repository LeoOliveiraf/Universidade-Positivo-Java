package Exercicio6OrientacaoObjeto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Corrida {
	private double pessoas[];
	private String dataCorrida;
	private String horaCorrida;
	private Participante participante;
	
	public Corrida() {
		pessoas = new double[10];
	}
	public Corrida(double [] pessoas, String dataCorrida, String horaCorrida, Participante participante) {
		this.pessoas = pessoas;
		this.dataCorrida = dataCorrida;
		this.horaCorrida = horaCorrida;
		this.participante = participante;
		inicializa();
	}
	private void inicializa() {
		for(int i = 0; i < 10; i++) {
			//
		}
	}
	public double[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(double[] pessoas) {
		this.pessoas = pessoas;
	}
	public String getDataCorrida() {
		return dataCorrida;
	}
	public void setDataCorrida(String dataCorrida) {
		this.dataCorrida = dataCorrida;
	}
	public String getHoraCorrida() {
		return horaCorrida;
	}
	public void setHoraCorrida(String horaCorrida) {
		this.horaCorrida = horaCorrida;
	}
	public Participante getParticipante() {
		return participante;
	}
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	public String DataHora(String dataCorrida, String horaCorrida) {
		Date dataHora = new Date();
		String dataFormat = new SimpleDateFormat("dd/MM/yyyy").format(dataCorrida);
		String horaFormat = new SimpleDateFormat("HH:mm:ss").format(horaCorrida);
		return dataFormat + " " + horaFormat;
	}
}
