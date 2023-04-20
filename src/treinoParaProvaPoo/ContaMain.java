package treinoParaProvaPoo;

public class ContaMain {

	public static void main(String[] args) {
		Conta conta = new Conta("Corrente", 452, "Leonardo", 1000);
		System.out.println(conta.toString());
		System.out.println(conta.sacar(500));
		System.out.println(conta.Depositar(1000));
		System.out.println(conta.toString());
		
	}

}
