package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double trapezio = 0;
		double quadrado = 0;
		System.out.println("Digite numero: ");
		a = input.nextDouble();
		System.out.println("Digite numero: ");
		b = input.nextDouble();
		System.out.println("Digite numero: ");
		c = input.nextDouble();
		
		trapezio = (a+b)/2;
		trapezio = trapezio * c;
		System.out.println("Area do trapezio é de: " + trapezio);
		
		//area do quadrado
		quadrado = b * b;
		System.out.println("Area do quadrado: " + quadrado);
	}
}
