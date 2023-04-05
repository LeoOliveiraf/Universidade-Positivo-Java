package HerancaOOPExercicios;

public class MainHeranca1 {
	public static void main(String[] args) {
		PessoaAlunoProfessor p1 = new PessoaAlunoProfessor();
		p1.setNome("Guilherme Frias");
		p1.setCpf("222.222.222-22");
		p1.setSexo('F');
		
		System.out.println("Pessoa: \n" + p1.dadosPessoa());
		
		Aluno a1 = new Aluno();
		a1.setNome("Vitor Carreira");
		a1.setCpf("111.111.111-11");
		a1.setSexo('F');
		a1.setCurso("ADS");
		a1.setAnoIngresso(2021);
		
		System.out.println("Aluno: \n" + a1.dadosAluno());
		
		Professor pro1 = new Professor();
		pro1.setNome("Pedro Abreu");
		pro1.setCpf("333.333.333-33");
		pro1.setSexo('M');
		pro1.setDepartamento("Estudandantil");
		pro1.setAnoAdmissao(2020);
		
		System.out.println("Professor: \n" + pro1.dadosProfessor());
		
		ProfessorDoutor proDoutor = new ProfessorDoutor();
		proDoutor.setNome("Guilherme Godin");
		proDoutor.setCpf("444.444.444-44");
		proDoutor.setSexo('M');
		proDoutor.setDepartamento("Educacional");
		proDoutor.setAnoAdmissao(2020);
		proDoutor.setInstituicaoDoutorado("UTFPR");
		proDoutor.setAnoObtencaoTitulo(2003);
		
		System.out.println("Professor Doutorado: \n" + proDoutor.dadosProfessorD());
	}
}
