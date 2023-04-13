package treinoParaProva;

public class Trabalho1 {
	private Integer matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double trabalho;
	public Trabalho1() {
		
		
	}
	public Trabalho1(Integer matricula, String nome, double nota1, double nota2, double trabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.trabalho = trabalho;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	public double media() {
		double mediaP = (nota1 * 2.5) + (nota2 * 2.5) + (trabalho * 2);
		double result = mediaP / 7;
		return result;
	}
	
	public Integer situacao() {
		if(media() >= 6) {
			System.out.println("\n");
			return 1;
		}
		if(media() >= 4 && media() <= 5.9) {
			System.out.println("\n");
			return 2;
		}
		System.out.println("\n");
		return 3;
	}
	
}
