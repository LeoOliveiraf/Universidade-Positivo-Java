package treinoParaProva;

public class Trabalho2Main {

	public static void main(String[] args) {
		
		Trabalho2 trabalho2 = new Trabalho2();
		trabalho2.setPreco(50);
		trabalho2.setQuantidade(0);
		trabalho2.aumentaEstoque(10);
		trabalho2.totalEstoque();
		trabalho2.diminuiEstoque(5);
		trabalho2.totalEstoque();
	}

}
