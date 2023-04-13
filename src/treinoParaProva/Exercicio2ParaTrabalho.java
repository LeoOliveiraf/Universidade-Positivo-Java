package treinoParaProva;

public class Exercicio2ParaTrabalho {
	private Integer matricula;
	private String nome;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho;
	
	
	public Exercicio2ParaTrabalho() {
		
	}

	public Exercicio2ParaTrabalho(Integer matricula, String nome, double notaProva1, double notaProva2,
			double notaTrabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
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

	public double getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public double getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public double mediaPonderada() {
		double media = (notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2);
		double mediaNotas = media / 7;
		return mediaNotas;
	}
	
	public int situacaoAluno() {
		if(mediaPonderada() >= 6) {
			System.out.println("\n");
			return 1;
		}
		if(mediaPonderada() >= 4 && mediaPonderada() <= 5.9) {
			System.out.println("\n");
			return  2;
		}
		System.out.println("\n");
		return 3;
	}
}
