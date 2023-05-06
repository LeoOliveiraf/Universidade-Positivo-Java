package TreinoAlgoritmo01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resposta = "";
		Concurso concurso = new Concurso();
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite Resposta:");
			resposta = input.next();
			concurso.addRespostas(resposta);
		}

	}

}
