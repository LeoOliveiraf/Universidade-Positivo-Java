package ExercicioOrientacaoObjeto;

public class AlunoMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Leonardo");
		aluno.setAno("2022");
		aluno.setNota1(41.5);
		aluno.setNota2(32);
		aluno.setNota3(20);
		double MediaAluno = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
		if(MediaAluno >= 60.0) {
			System.out.println("Aluno Aprovado!");
			System.out.printf("%.1f",MediaAluno);
		}
		if(MediaAluno < 60.0) {
			System.out.println("\nAluno Reprovado!");
			System.out.printf("%.1f", MediaAluno);
		}
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.setAno("2022");
		aluno2.setNota1(80);
		aluno2.setNota2(95.5);
		aluno2.setNota3(63.3);
		double MediaAluno2 = (aluno2.getNota1() + aluno2.getNota2() + aluno2.getNota3()) / 3;
		if(MediaAluno2 >= 60.0) {
			System.out.println("\nAluno Aprovado!");
			System.out.printf("%.1f", MediaAluno2);
		}
		if(MediaAluno2 < 60.0) {
			System.out.println("\nAluno Reprovado!");
			System.out.printf("%.1f",MediaAluno2);
		}
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Bernardo");
		aluno3.setAno("2022");
		aluno3.setNota1(63.9);
		aluno3.setNota2(81);
		aluno3.setNota3(70);
		double MediaAluno3 = (aluno3.getNota1() + aluno3.getNota2() + aluno3.getNota3()) / 3;
		if(MediaAluno3 >= 60.0) {
			System.out.println("\nAluno Aprovado ");
			System.out.printf("%.1f", MediaAluno3);
		}
		if(MediaAluno3 < 60.0) {
			System.out.println("\nAluno Reprovado!");
			System.out.printf("%.1f",MediaAluno3);
		}
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Bernardo");
		aluno4.setAno("2022");
		aluno4.setNota1(76);
		aluno4.setNota2(43);
		aluno4.setNota3(65);
		double MediaAluno4 = (aluno4.getNota1() + aluno4.getNota2() + aluno4.getNota3()) / 3;
		if(MediaAluno4 >= 60.0) {
			System.out.println("\nAluno Aprovado ");
			System.out.printf("%.1f", MediaAluno4);
		}
		if(MediaAluno4 < 60.0) {
			System.out.println("\nAluno Reprovado!");
			System.out.printf("%.1f",MediaAluno4);
		}
		
		double mediaFaculdade = (MediaAluno + MediaAluno2 + MediaAluno3 + MediaAluno4)/4;
		
		if(mediaFaculdade >= 80) {
			System.out.println("\nEnsino da Faculdade esta Otimo");
			System.out.printf("%.1f",mediaFaculdade);
		}
		if(mediaFaculdade < 80 && mediaFaculdade >= 60) {
			System.out.println("\nEnsino da Faculdade esta Mediano");
			System.out.printf("%.1f",mediaFaculdade);
		}
		if(mediaFaculdade < 60) {
			System.out.println("\nEnsino da Faculdade esta Ruim");
			System.out.printf("%.1f", mediaFaculdade);
		}
	}
} 
