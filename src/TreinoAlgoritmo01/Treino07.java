package TreinoAlgoritmo01;

import java.util.Scanner;

public class Treino07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = input.nextInt();
		int contador = 0;
		int resto = 0;
		for(int i =0; i < valor; i++) {
			valor = valor - 100;
			if(valor <= 100) {
				resto = valor;
				break;
			}
			contador++;	
		}
		if(contador >= 0) {
			contador = contador +1;
			if(contador == 1) {
				contador = 0;
			}
		}
		System.out.println(contador + " nota(s) de R$100,00");
		int contador2 = 1;
		for(int i =0; i < resto; i++) {
			resto = resto - 50;
			if(resto <= 50) {
				resto = resto;
				break;
			}
			contador2++;
		}
		System.out.println(contador2 + " nota(s) de R$50,00");
		int contador3 = 1;
		for(int i =0; i < resto; i++) {
			resto = resto - 20;
			if(resto <= 20) {
				resto = resto;
				break;
			}
			contador3++;
		}
		System.out.println(contador3 + " nota(s) de R$20,00");
		int contador4 = 0;
		for(int i =0; i < resto; i++) {
			resto = resto - 10;
			if(resto <= 10) {
				resto = resto;
				break;
			}
			contador4++;
		}
		System.out.println(contador4 + " nota(s) de R$10,00");
		int contador5 = 1;
		for(int i =0; i < resto; i++) {
			resto = resto - 5;
			if(resto <= 5) {
				resto = resto;
				break;
			}
			contador5++;
		}
		System.out.println(contador5 + " nota(s) de R$5,00");
		int contador6 = 0;
		for(int i =0; i < resto; i++) {
			resto = resto - 2;
			if(resto <= 2) {
				resto = resto;
				break;
			}
			contador6++;
		}
		System.out.println(contador6 + " nota(s) de R$2,00");
		int contador7 = 1;
		for(int i =0; i < resto; i++) {
			resto = resto - 1;
			if(resto <= 1) {
				resto = resto;
				break;
			}
			contador7++;
		}
		System.out.println(contador7 + " nota(s) de R$1,00");
	}
	}
	
