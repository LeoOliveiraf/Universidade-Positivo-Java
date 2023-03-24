package Aula06;

import java.util.Scanner;

public class Treino12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int veloMotorista = 0;
		System.out.println("Informe a velocidade do Veiculo: ");
		veloMotorista = input.nextInt();
		int limiteVia = 0;
		System.out.println("Informe o Limite da Via: ");
		limiteVia = input.nextInt();
		double vinteP = 0;
		double cinquentaP = 0;
		System.out.println("Limite Permitido da Via: " + limiteVia);
		cinquentaP = 0.5 * limiteVia;
		cinquentaP = cinquentaP + limiteVia;
		vinteP = 0.2 * limiteVia;
		vinteP = vinteP + limiteVia;
		if(veloMotorista > limiteVia && veloMotorista < vinteP) {
			System.out.println("Você Ultrapassou 20% do Limite da Via, "
					+ "Sua Multa é de R$130,16");
		}
		if(veloMotorista > vinteP && veloMotorista < cinquentaP) {
			System.out.println("Você Ultrapassou o Limite da Via, "
					+ "Sua Multa é de R$195,23");
		}
		if(veloMotorista > limiteVia && veloMotorista > cinquentaP) {
			System.out.println("Você Ultrapassou 50% do Limite da Via, "
					+ "Sua Multa é de R$880,41");
		}
	}
}
