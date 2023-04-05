package HerancaOOPExercicios;

public class ProfessorDoutor extends Professor{
	private Integer anoObtencaoTitulo;
	private String instituicaoDoutorado;
	
	public Integer getAnoObtencaoTitulo() {
		return anoObtencaoTitulo;
	}
	public void setAnoObtencaoTitulo(Integer anoObtencaoTitulo) {
		this.anoObtencaoTitulo = anoObtencaoTitulo;
	}
	public String getInstituicaoDoutorado() {
		return instituicaoDoutorado;
	}
	public void setInstituicaoDoutorado(String instituicaoDoutorado) {
		this.instituicaoDoutorado = instituicaoDoutorado;
	}
	
	public String dadosProfessorD() {
		String str = dadosProfessor() + 
				"\nAno Obtencao Titulo: "+ anoObtencaoTitulo + " \n"
				+"Instituicao Doutorado: " + instituicaoDoutorado;
		return str;	
	}
}
