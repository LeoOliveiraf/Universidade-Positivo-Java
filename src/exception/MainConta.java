package exception;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		Scanner in = new Scanner(System.in);
		System.out.println("Digite Um valor");
		double valor = in.nextDouble();
		c.setValorSaldo(valor);
		c.depositar(500);
		System.out.println("Digite valor para sacar");
		double saque = in.nextDouble();
		try {
			c.sacar(saque);
		}catch(ExcecaoConta ex) {
			System.out.println(ex.toString());
		}
		

	}

}
