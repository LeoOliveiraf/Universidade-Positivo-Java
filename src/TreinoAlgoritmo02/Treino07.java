package TreinoAlgoritmo02;

import java.util.Scanner;

public class Treino07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int numero = 0;
		int contador = 0;
		boolean verifica = true;
		double media = 0;
		int soma = 0;
		System.out.println("Informe um Numero: ");
		while(numero >= 0) {
			numero = input.nextInt();
			soma = soma + numero;
		if(verifica == true) {
			maior = numero;
			menor = numero;
		}
		verifica = false;
		if(numero >= 0) {
			
			if(maior < numero) {
				maior = numero;
			}
			if(menor > numero) {
				menor = numero;
			}
		}
		contador++;
		media = soma / contador;
		}
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		System.out.println("Media: " + media);
		}
	}

