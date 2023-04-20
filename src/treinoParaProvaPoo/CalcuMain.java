package treinoParaProvaPoo;

public class CalcuMain {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora(5,5);
		 System.out.println("Soma: " + calcu.soma());
		 System.out.println("Subtra: " + calcu.subtra());
		 System.out.println("Divisao: " + calcu.divi());
		 System.out.println("Multi: " + calcu.multi());

	}

}
