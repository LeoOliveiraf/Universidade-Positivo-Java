package exception;

public class ParImpar {
	private int numero;
	
	public ParImpar() {
		
	}
	public ParImpar(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void verificaParImpar() {
		try {
			if(numero % 2 == 0) {
				System.out.println("Numero PAR");
			}else {
				throw new ExcecaoParImpar(numero);
			}
		} catch(ExcecaoParImpar ex) {
			System.out.println("To StrinExcecaoParImparg: " + ex.toString());
			System.out.println("Get Message: " + ex.getMessage());
		}
	}
	
	public void verificaParImpar2() throws ExcecaoParImpar{
		if(numero % 2 == 0) {
			System.out.println("Numero PAR");
		}else {
			throw new ExcecaoParImpar(numero);
		}
	}
}
