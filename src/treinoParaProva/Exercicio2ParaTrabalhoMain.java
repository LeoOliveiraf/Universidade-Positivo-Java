package treinoParaProva;

import java.util.Scanner;

public class Exercicio2ParaTrabalhoMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Exercicio2ParaTrabalho aluno = new Exercicio2ParaTrabalho();
		aluno.setNome("Leonardo Oliveira");
		aluno.setMatricula(1);
		aluno.setNotaProva1(5);
		aluno.setNotaProva2(5);
		aluno.setNotaTrabalho(5);
		System.out.println(aluno.mediaPonderada());
		System.out.println(aluno.situacaoAluno());
	}

}
