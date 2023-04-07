package byteBankHeranca;

public class SistemaInterno {
	
	private int senha = 2222;
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode Entrar Sistema");
		}else {
			System.out.println("Não Pode Entrar Sistema");
		}
	}
}
