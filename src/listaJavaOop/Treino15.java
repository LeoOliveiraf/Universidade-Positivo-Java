package listaJavaOop;

import java.util.Scanner;

public class Treino15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o rendimento Anual: ");
		double rendimento = input.nextDouble();
		
		if(rendimento > 0 && rendimento <= 1200) {
			double a = rendimento;
			System.out.println("Imposto a ser pago: " + a);
		}
		if(rendimento > 1200 && rendimento <= 2300) {
			double b = (rendimento * 7.5) / 100;
			System.out.println("Imposto a ser pago: " + b);
		}
		if(rendimento > 2300 && rendimento <= 3700) {
			double c = (rendimento * 12.5) / 100;
			System.out.println("Imposto a ser pago: " + c);
		}
		if(rendimento > 3700 && rendimento <= 5100) {
			double d = (rendimento * 17.5) / 100;
			System.out.println("Imposto a ser pago: " + d);
		}
		if(rendimento > 5100) {
			double e = (rendimento * 27.5) / 100;
			System.out.println("Imposto a ser pago: " + e);
		}
	}
}
