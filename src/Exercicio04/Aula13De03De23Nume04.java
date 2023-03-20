package Exercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula13De03De23Nume04 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String nomesCompletos;
		System.out.println("Infome um Nome Inteiro: ");
		do {
			nomesCompletos = input.next();
			if(!nomes.contains(nomesCompletos)) {
				nomes.add(nomesCompletos);
			}
		}while(!nomesCompletos.equals("Fim"));
		String consulta;
		System.out.println("Informe o nome de Consulta: ");
		consulta = input.next();
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).contains(consulta)) {
				System.out.println("Nomes Encontrados na Posição: " + i);
				String remove = null;
				System.out.println("Informe um nom para Remover: ");
				remove = input.next();
				if(nomes.get(i).contains(consulta)) {
					nomes.remove(remove);
					String RemoveFim = "Fim";
					nomes.remove(RemoveFim);
					System.out.println("Nomes Após a Remoçao: " + nomes);
				}
			}
			
			
			
		}
		
	}
	
}
