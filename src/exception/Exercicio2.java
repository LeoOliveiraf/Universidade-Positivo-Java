package exception;

public class Exercicio2 {
	public void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	public void metodo2() {
		System.out.println("Inicio do metodo 2");
		int [] vetor = new int[10];
		try {
		for(int i = 0; i < 15; i++){
			vetor[i] = i;
			System.out.println(i);
		}
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Fim do metodo 2");
	}
}
