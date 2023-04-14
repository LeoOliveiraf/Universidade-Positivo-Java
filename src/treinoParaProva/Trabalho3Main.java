package treinoParaProva;

public class Trabalho3Main {

	public static void main(String[] args) {
		
		Trabalho3 trabalho3 = new Trabalho3();	
		trabalho3.setNotaProva1(5);
		trabalho3.setNotaProva2(5);
		trabalho3.setNotaTrabalho(5);
		System.out.println(trabalho3.mediaPonderada());
		System.out.println(trabalho3.situacaoAluno());
	}

}
