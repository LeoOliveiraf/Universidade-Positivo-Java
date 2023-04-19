package treinoParaProva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ReceitaFederal rf = new ReceitaFederal();
		Pessoa pessoa = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		int opcao = 0;
		while(opcao != 8) {
			System.out.println("1-Adicionar Pessoa"+"\n"+ 
								"2-Remover Pessoa"+"\n"+ 
								"3-Quantidade Pessoa Fisica"+"\n"+ 
								"4-Quantidade Pessoa Juridica"+"\n"+ 
								"5-Calcular Imposto"+"\n"+ 
								"6-Calcular Total Imposto"+"\n"+ 
								"7-Imprimir Todas Pessoas"+"\n"+
								"8-Sair");
			opcao = input.nextInt();
			switch(opcao) {
			case 1: {
				System.out.println("Quer adicionar uma pessoa Fisica ou Juridica?");
				System.out.println("Digite 1 para Fisica" + "\n"+ "Digite 2 para Juridica");
				int result = input.nextInt();
				input.nextLine();
				if(result == 1) {
					System.out.println("Nome:");
					String nome = input.nextLine();
					pf.setNome(nome);
					System.out.println("Endereco:");
					String endereco = input.nextLine();
					pf.setEndereco(endereco);
					System.out.println("Renda");
					double renda = input.nextDouble();
					pf.setRenda(renda);
					System.out.println("CPF:");
					String cpf = input.next();
					pf.setCpf(cpf);
					rf.adicionarPessoa(pf);
				}else {
					System.out.println("Nome:");
					String nome = input.nextLine();
					pj.setNome(nome);
					System.out.println("Endereco:");
					String endereco = input.nextLine();
					pj.setEndereco(endereco);
					System.out.println("Renda");
					double renda = input.nextDouble();
					pj.setRenda(renda);
					System.out.println("CNPJ:");
					String cnpj = input.next();
					pj.setCnpj(cnpj);
					rf.adicionarPessoa(pj);
				}
				break;
			}
			case 2: {
				System.out.println("Nome p/ Remover:");
				String nome = input.nextLine();
				rf.removerPessoa(nome);
				break;
			}
			case 3: {
				System.out.println(rf.qtdPessoaFisica());
				break;
			}
			case 4: {
				System.out.println(rf.qtdPessoaJuridica());
				break;
			}
			case 5: {
				System.out.println("Nome p/ Remover:");
				String nome = input.nextLine();
				System.out.println(rf.impostoPessoa(nome));
				break;
			}
			case 6: {
				System.out.println(rf.calculaTotalImposto());
				break;
			}
			case 7: {
				rf.imprime();
				break;
			}
			case 8:{
				System.out.println("Obrigado Por usar nossos Serviços!");
			}
			default :{
				System.out.println("Opçao Invalida!");
			}
			}
	}
	}

}
