package treinoParaProvaPoo;

public class MainFunc {

	public static void main(String[] args) {
		
		
		Funcionario funci1 = new Funcionario("Leonardo", "Oliveira", 5, 50);
		Funcionario funci2 = new Funcionario("Pedro", "Nogueira", 10, 80);
		
		System.out.println(funci1.nomeC());
		System.out.println(funci1.salario());
		System.out.println(funci1.incrementa(300));
		System.out.println(funci1.decrementa(250));
		System.out.println(funci1.aumenta(10));
		
		
		
	}

}
