package exception;

public class ExcecaoParImpar extends Exception{
	private int numero;
	
	public ExcecaoParImpar() {
		
	}
	public ExcecaoParImpar(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "O numero: " + numero + " é IMPAR!";
	}
	
	public String getMessage() {
		return "O numero é IMPAR";
	}
}
