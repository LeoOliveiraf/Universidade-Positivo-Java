package algoritmo;

public class Exercicio4 {

	public static void main(String[] args) {
		//Faça um programa que percorra todos os números de 1 até 20. Para os números
		//ímpares, deve ser impresso um “*”, e para os números pares, devem ser impressos dois
		//“**”.
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println("Numero PAR: " + i + " **");
			}else {
				System.out.println("Numero IMPAR: " + i + " *");
			}
		}
	}

}
