package Exercicio4OrientacaoObjeto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class ViagemMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um Lugar: ");
		Integer lugar = input.nextInt();
		Viagem viagem = new Viagem(lugar);
		viagem.verificaPoltrona(lugar);
	
		
		
	}
}
