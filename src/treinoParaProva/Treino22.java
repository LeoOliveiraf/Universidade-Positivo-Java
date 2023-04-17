package treinoParaProva;

import java.util.ArrayList;
import java.util.Scanner;

public class Treino22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int opcao = 0;
		while(opcao != 7) {
			System.out.println("1-Adicionar"+"\n"+ 
								"2-Remover"+"\n"+ 
								"3-Verificar P"+"\n"+ 
								"4-Modificar"+"\n"+ 
								"5-Media"+"\n"+ 
								"6-Imprimir"+"\n"+ 
								"7-Sair");
			opcao = input.nextInt();
			switch(opcao) {
			case 1: {
				System.out.println("Digite um Numero p/ adicionar:");
				int adicionar = input.nextInt();
				array.add(adicionar);
				System.out.println("Adicionado com Sucesso!");
				break;
			}
			case 2: {
				System.out.println("Digite um Numero p/ remover:");
				int remover = input.nextInt();
				for(int i = 0; i < array.size(); i++) {
					if(array.contains(remover)) {
						array.remove(remover);
						System.out.println("Removido com Sucesso!");
					}
				}
				break;
			}
			case 3: {
				System.out.println("Numero de Busca:");
				int busca = input.nextInt();
				for(int i = 0; i < array.size(); i++) {
					if(array.contains(busca)) {
						System.out.println("Posição:" + array.get(i));
					}
				}
				break;
			}
			case 4: {
				System.out.println("Posição para modificar:");
				int modifica = input.nextInt();
				for(int i = 0; i < array.size(); i++) {
					if(array.contains(modifica)) {
						System.out.println("Novo valor:");
						Integer novo = input.nextInt();
						array.add(novo);
					}
				}
				break;
			}
			case 5: {
				int soma = 0;
				int contador = 0;
				for(int i = 0; i < array.size(); i++) {
					soma += array.get(i) ;
				}
				int media = soma / contador;
				System.out.println("Media " + media);
				break;
			}
			case 6: {
				for(int i = 0; i < array.size(); i++) {
					System.out.println("["+array.toString()+"]" + array.get(i));
				}
				break;
			}
			case 7: {
				System.out.println("Ate Logo!");
			}
			default :{
				System.out.println("Opcao Invalida");
			}
			}
		}
	}
	//TERMINAR
}
