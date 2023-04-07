package byteBankHeranca;

public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("TESTANDO EV");
		return super.getBonificacao() + 100;
	}
}
