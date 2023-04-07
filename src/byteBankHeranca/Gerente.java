package byteBankHeranca;
//Gerente é um funcionarioAutenticavel, gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel{
	
	public double getBonificacao() {
		return  super.getSalario();
	}
}
