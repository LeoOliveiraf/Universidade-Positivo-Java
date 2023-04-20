package treinoParaProvaPoo;

public class TesteReceitaUni {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		al.setMensalidade(500);
		AlunoBolsista ab = new AlunoBolsista();
		ab.setMensalidade(800);
		ab.setDesconto(10);
		System.out.println(ab.pagarM(10));
		ReceitaUni ru = new ReceitaUni();
		System.out.println(ru.recebePag(al, 5));
		System.out.println(ru.recebePag(ab, 10));
		

	}

}
