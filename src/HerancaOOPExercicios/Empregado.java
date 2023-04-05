package HerancaOOPExercicios;

public class Empregado extends Pessoa{
	private Integer codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		
	}

	public Empregado(Integer codigoSetor, double salarioBase, double imposto) {
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void salarioLiquido() {
		double salarioL = 0;
		double porcentagem = 0;
		porcentagem  = (imposto / 100) * salarioBase;
		salarioL = salarioBase - porcentagem;
		System.out.printf("Salario Liquido: " + "%.3f",salarioL);
	}
	
	public String dadosEmpregado() {
		String str = dadosPessoa() + "\nCodigo Setor: " + codigoSetor + "\nSalario Base: " + salarioBase + "\nValor Imposto: " + imposto;
		return str;
	}
}
