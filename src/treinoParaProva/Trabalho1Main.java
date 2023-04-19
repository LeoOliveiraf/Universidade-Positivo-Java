package treinoParaProva;

public class Trabalho1Main {
	public static void main(String[] args) {
		Trabalho1 tr = new Trabalho1();
		tr.fato(10);
		System.out.println(tr.expo(2, 5));
		int [] vetor = new int [] {10, 20, 50, 5};
		System.out.println(tr.maior(vetor));
	}
}
