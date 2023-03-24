package Aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino06 {
	public static void main(String[] args) {
		ArrayList<String> triagem = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 7) {
			System.out.println("1- Adicionar um Paciente \n"
					+ "2- Atender um Paciente \n"
					+ "3- Desistência \n"
					+ "4- Verificar Posição do Paciente \n"
					+ "5- Verificar Tamanho da Fila \n"
					+ "6- Imprimir Fila \n"
					+ "7- Sair");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:
				String NomePaciente = null;
				System.out.println("Digite o Nome do Paciente: ");
				NomePaciente = input.next();
				 triagem.add(NomePaciente);
			break;
			case 2:
				String AtPaciente = null;
				System.out.println("Nome do Paciente a ser Atendido: ");
				AtPaciente = input.next();
				for(int i = 0; i  < triagem.size(); i++) {
					if(triagem.contains(AtPaciente)) {
						if(triagem.indexOf(AtPaciente) == 0) {	
							System.out.println("Chegou sua Vez de ser Atendido :)");
							triagem.remove(AtPaciente);
						}else {
							System.out.println("Ainda Não chegou sua vez, Aguarde!");
						}
					}
				}
			break;
			case 3: 
				String DePaciente = null;
				System.out.println("Nome do Paciente Desistente: ");
				DePaciente = input.next();
				for(int i = 0; i < triagem.size(); i++) {
					if(triagem.contains(DePaciente)) {
						triagem.remove(DePaciente);
						System.out.println("Paciente Removido da Lista! \n");
						System.out.println("Lista Atualizada: " + triagem.toString());
					}
				}
			break;
			case 4:
				String PoPaciente = null;
				System.out.println("Digite o Nome do Paciente para consulta: ");
				PoPaciente = input.next();
				int posicao = 0;
				for(int i = 0; i < triagem.size(); i++) {
					if(triagem.contains(PoPaciente)) {
						 posicao = triagem.indexOf(PoPaciente);
						 posicao = posicao +1;
					}
				}
				System.out.println("Paciente está na Posição: "  + posicao + " da Fila.");
			break;
			case 5:
				int soma = 0;
				soma = soma + triagem.size();
				System.out.println("Tem " + soma + " pessoas na fila.");
			break;
			case 6:
				for(int i = 0; i < triagem.size(); i++) {
					int fila = 0;
					fila = i + 1;
					System.out.println(fila + " " + triagem.get(i));
				}
			break;
			case 7: 
				System.out.println("Voce saiu do Menu, Ate Logo");
			break;
			default:
				System.out.println("Opção Invalida, Escolha uma opção do Menu!");
			}
		}
	}
}
