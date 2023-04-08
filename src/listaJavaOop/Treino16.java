package ExercicioOrientacao;

import java.util.Scanner;

public class Treino16 {
	public static void main(String[] args) {
		//23/12/2000
		Scanner input = new Scanner(System.in);
	
		/*System.out.println("Informe a Data: ");
		String data = input.nextLine();
		
		String mes = data.substring(3,5);
		String dia = data.substring(0,2);
		String ano = data.substring(6,10);
		
		Integer mesInt = Integer.parseInt(mes);
		Integer diaInt = Integer.parseInt(dia);
		Integer anoInt = Integer.parseInt(ano);
		if(mesInt > 0 && mesInt <= 12) {
			System.out.println("Mes Corresponde " + mesInt);
			if(diaInt > 0 && diaInt <= 31) {
				System.out.println("Dia Corresponde " + diaInt);
				if((anoInt % 400 == 0) || (anoInt % 4 ==0) && (anoInt % 100 != 0)) {
					System.out.println("Ano Bi");
					if(mesInt == 02 || mesInt == 2) {
						if(diaInt > 0 && diaInt <= 29) {
							System.out.println("Fevereiro " + diaInt);
						}
					}
				}else if(mesInt == 02 || mesInt == 2) {
					if(diaInt > 0 && diaInt <= 28) {
						System.out.println("Fevereiro " + diaInt);
					}else {
						System.out.println("Dia Não Corresponde");
					}
				}
			}
		}else {
			System.out.println("Dia Não Corresponde");
		}
		Uma Forma de Fazer
		*/
		System.out.println("Informe uma data sem barra: ");
		Integer data = input.nextInt();
		
		Integer dia = data / 100;
		dia = dia / 100;
		System.out.println(dia);
		
		Integer mes = data / 100;
		mes = mes % 100;
		System.out.println(mes);
		
		Integer ano = data % 100;
		System.out.println(ano);
		
		if(mes > 0 && mes <= 12) {
			if(dia > 0 && dia  <= 31) {
				if((ano % 400 == 0) || (ano % 4 ==0) && (ano % 100 != 0)) {
					if(mes == 02 || mes == 2) {
						if(dia > 0 && dia <=29) {
							System.out.println("Dia Corresponde");
						}
					}
				}else if(mes == 02 || mes == 2) {
					if(dia > 0 && dia <= 28) {
						System.out.println("Ano Não Bissexto");
						System.out.println("Dia Corresponde " + dia);
					}
				}
			}else {
				System.out.println("Dia NAO corresponde");
			}
		}else {
			System.out.println("Desculpe Mes nao Corresponde");
		
		}
	}
}
