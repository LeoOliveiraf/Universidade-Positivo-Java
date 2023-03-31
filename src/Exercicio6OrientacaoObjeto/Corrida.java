package Exercicio6OrientacaoObjeto;

import java.util.ArrayList;

public class Corrida {
	private String dataCorrida;
	private String horaCorrida;
	private ArrayList<Participante> participante = new ArrayList<Participante>();
	
	public Corrida() {
		
	}

	public Corrida(String dataCorrida, String horaCorrida, ArrayList<Participante> participante) {
		this.dataCorrida = dataCorrida;
		this.horaCorrida = horaCorrida;
		this.participante = participante;
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

	public ArrayList<Participante> getParticipante() {
		return participante;
	}

	public void  setParticipante(ArrayList<Participante> participante) {
		this.participante = participante;
	}
	
	public Participante adicionar(Participante participantes) {
		if(participante.contains(participantes)) {
			System.out.println("Jogador ja faz parte do time");
		}else {
			participante.add(participantes);
		}
		return participantes;
	}
	 
	public void idade(Integer idade) {
		int contador = 0;
		for(Participante itens : participante) {
			if(itens.getIdade() > idade) {
				contador++;
			}
		}
		System.out.println("Qtd Pessoas com idade maior: " + contador);
	}
	
	public void imc() {
		int contador = 0;
		for(Participante imc : participante) {
			double result = imc.getPeso() / (imc.getAltura() * imc.getAltura());
			if(result >= 18.5 && result <= 24.9) {
				System.out.println("IMC Normal");
				contador++;
			}
			if(result < 18.5) {
				System.out.println("imc Baixo");
			}
			if(result > 24.9) {
				System.out.println("imc Alto");
			}
		}
		System.out.println("Qtd imc Normal: " + contador);
	}
	
	public void remover(Participante pessoa) {
		System.out.println(participante.remove(pessoa));
	}
	public void dataHora(String data, String hora) {
		System.out.println("Data d Corrida: " + data);
		System.out.println("Hora d Corrida: " + hora);
	}
}
