package treinoParaProvaPoo;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;
	private ArrayList<Empregado> empregados;
	public Empresa() {
		empregados = new ArrayList<Empregado>();
	}
	public Empresa(String nome, String cnpj, ArrayList<Empregado> empregados) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(ArrayList<Empregado> empregados) {
		this.empregados = empregados;
	}
	
	public void addEmpregado(Empregado empregado) {
		empregados.add(empregado);
	}
	public Integer qtdFunci() {
		return empregados.size();
	}
	public Integer funciHorista() {
		Integer horistas = 0;
		for(int i = 0; i < empregados.size(); i++) {
			if(empregados.get(i) instanceof Horista) {
				horistas++;
			}
		}
		return horistas;
	}
	
	public Integer funciAssala() {
		Integer assalariado = 0;
		for(int i = 0; i < empregados.size();i++) {
			if(empregados.get(i) instanceof Assalariado) {
				assalariado++;
			}
		}
		return assalariado;
	}
	
	public double gastoMensal() {
		double total = 0;
		for(int i = 0; i < empregados.size();i++) {
			if(empregados.get(i) instanceof Assalariado) {
				Assalariado a1 = (Assalariado) empregados.get(i);
				total += a1.getSalario();
			}else {
				Horista h1 = (Horista) empregados.get(i);
				total  = h1.getQtdHora() * h1.getValorHora();
			}
		}
		return total;
	}
}
