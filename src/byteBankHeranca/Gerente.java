package byteBankHeranca;
//Gerente é um funcionario, gerente herda da class Funcionario
public class Gerente extends Funcionario{
	private int senha;
	
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}
}