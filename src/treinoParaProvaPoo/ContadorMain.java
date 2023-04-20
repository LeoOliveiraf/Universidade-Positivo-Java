package treinoParaProvaPoo;

public class ContadorMain {

	public static void main(String[] args) {
		Contador cont = new Contador(2);
		System.out.println(cont.zero());
		System.out.println(cont.incrementar());
		System.out.println(cont.decrementar());
		System.out.println(cont.soma(5));
		System.out.println(cont.subtra(3));

	}

}
