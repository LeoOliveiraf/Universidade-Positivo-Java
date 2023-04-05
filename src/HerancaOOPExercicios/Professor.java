package HerancaOOPExercicios;

public class Professor extends PessoaAlunoProfessor{
	private String departamento;
	private Integer anoAdmissao;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Integer getAnoAdmissao() {
		return anoAdmissao;
	}
	public void setAnoAdmissao(Integer anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	public String dadosProfessor() {
		String str = dadosPessoa() + 
				"\nDepartamento: "+ departamento + " \n"
				+"Ano Admissao: " + anoAdmissao;
		return str;	
	}
}
