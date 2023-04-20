package treinoParaProvaPoo;

import java.util.ArrayList;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private double horas;
	private double valor;
	private ArrayList<Funcionario> funcionario;
	public Funcionario() {
		funcionario = new ArrayList<Funcionario>();
	}
	public Funcionario(ArrayList<Funcionario> funcionario) {
		super();
		this.funcionario = funcionario;
	}
	public Funcionario(String nome, String sobrenome, double horas, double valor) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.horas = horas;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public String nomeC() {
		String nomeCompleto = getNome().concat(getSobrenome());
		return nomeCompleto;
	}
	public double salario() {
		double salario = this.horas * this.valor;
		return salario;
	}
	public double incrementa(Integer valor) {
		double hora = salario() + valor;
		return hora;
	}
	public double decrementa(Integer valor) {
		double hora = salario() - valor;
		return hora;
	}
	public double aumenta(Integer porce) {
		double valor = (porce/100) * salario();
		double reajuste = valor + salario();
		
		return reajuste;
	}
}
