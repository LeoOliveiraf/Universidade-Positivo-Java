package DesafioOOPTreino;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);
		String nome = null;
		String email = null;
		String telefone = null;
		System.out.println("Escolha uma opção: \n"
				 + "1- Entrar \n"
				 + "2- Sair \n");
		Integer num = scanner.nextInt();
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n"
					 + "1- Adicionar um Contado\n"
					 + "2- Remover um Contado\n"
					 + "3- Buscar um Contado pelo Nome: \n"
					 + "4- Alterar um Contado pelo Nome:\n"
					 + "5- Imprimir Agenda\n"
					 +"6- Sair");
Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
					System.out.println("Digite um Nome: ");
					nome = scanner.next();
					System.out.println("Digite um email: ");
					email = scanner.next();
					System.out.println("Digite um telefone: ");
					telefone = scanner.next();
					Contato contato = new Contato(nome, email, telefone);
					agenda.adicionar(contato);
					//Atributos diferentes criam um novo Objeto
				break;
			}
			case 2: {
				System.out.println("Digite o nome para Remover");
				nome = scanner.next();
				agenda.remover(nome);
				break;
			}
			case 3: {
				System.out.println("Digite um nome para Buscar");
				nome = scanner.next();
				agenda.buscar(nome);
				break;
			}
			case 4: {
				System.out.println("Digite o nome para Alterar");
				nome = scanner.next();
				System.out.println("Digite um Nome: ");
				String nomeAlterado = scanner.next();
				System.out.println("Digite um email: ");
				email = scanner.next();
				System.out.println("Digite um telefone: ");
				telefone = scanner.next();
				agenda.alterar(nome, nomeAlterado, email, nomeAlterado);
				break;
			}
			case 5:{
				agenda.imprimir();
				break;
			}
			default:
				num = 2;
			}
		}
		
	}
}
