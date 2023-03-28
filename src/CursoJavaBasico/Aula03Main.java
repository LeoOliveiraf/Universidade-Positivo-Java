package CursoJavaBasico;

public class Aula03Main {
//Modificadores de acesso
	public static void main(String[] args) {
		Aula03 carro = new Aula03();
		
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		
		Aula03 calc = new Aula03();
		calc.soma(1, 5);
		calc.soma(1, 5);
		
	}
	
}
