package treinoParaProva;

public class Trabalho2Main {

	public static void main(String[] args) {
		Trabalho2 tr = new Trabalho2();
		tr.setPreco(50);
		tr.setQtd(10);
		System.out.println(tr.estoque());
		System.out.println(tr.aumenta(10));
		System.out.println(tr.estoque());
		System.out.println(tr.diminui(5));
		System.out.println(tr.estoque());
	}

}
