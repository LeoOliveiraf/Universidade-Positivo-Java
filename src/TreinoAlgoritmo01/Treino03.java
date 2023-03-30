package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double raio = 0;
		double altura = 0;
		double pi = 3.14;
		double volume = 0;
		System.out.println("Digite Raio: ");
		raio = input.nextDouble();
		System.out.println("Digite Altura: ");
		altura = input.nextDouble();
		raio = raio * raio;
		volume = (pi * raio)*altura;
		System.out.println("Volume da caixa dágua: " + volume);
	}
}
