package treinoParaProvaPoo;

public class Ex1Main {
	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		System.out.println(ex.fatorial(10));
		System.out.println(ex.expo(2, 5));
		int[] vetor = new int[] {10, 50, 30,10};
		System.out.println(ex.maior(vetor));
		ex.primo(3);
		ex.fibonacci(5);
	}
}
