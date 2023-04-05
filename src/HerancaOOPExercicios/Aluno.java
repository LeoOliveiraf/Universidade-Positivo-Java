package HerancaOOPExercicios;

public class Aluno extends PessoaAlunoProfessor {
	private Integer anoIngresso;
	private String curso;
	
	
	public Integer getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String dadosAluno() {
		String str = dadosPessoa() + 
				"\nCurso: "+ curso + " \n"
				+"Ano Ingresso: " + anoIngresso;
		return str;	
	}
}
