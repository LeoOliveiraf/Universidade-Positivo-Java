package treinoParaProva;

public class Trabalho1Main {
	public static void main(String[] args) {
		Trabalho1 aluno = new Trabalho1();
		aluno.setNota1(5);
		aluno.setNota2(5);
		aluno.setTrabalho(5);
		System.out.println(aluno.media());
		
		System.out.println(aluno.situacao());
	}
}
