package treinoAbstract;

public class TesteRefeicao {

	public static void main(String[] args) {
		
		PratoFeito pf1 = new PratoFeito("01/05", 13, "Leonardo", 50, 15);
		PratoFeito pf2 = new PratoFeito("01/05", 12, "Jorge", 40, 15);
		PratoFeito pf3 = new PratoFeito("01/05", 11, "Fernanda", 35, 15);
		
		Buffet bf1 = new Buffet("01/05", 10, "Lucas", 45, 50);
		Buffet bf2 = new Buffet("01/05", 14, "Pietro", 45, 60);
		Buffet bf3 = new Buffet("01/05", 14, "Maria", 45, 80);
		PratoFeito pf4 = new PratoFeito("01/05", 13, "Leonardo", 50, 15);
		
		RefeicoesDiarias fd = new RefeicoesDiarias();
		fd.adicionarRefeicao(pf1);
		fd.adicionarRefeicao(pf2);
		fd.adicionarRefeicao(pf3);
		fd.adicionarRefeicao(bf1);
		fd.adicionarRefeicao(bf2);
		fd.adicionarRefeicao(bf3);
		fd.adicionarRefeicao(pf4);
		fd.removeRefeicao("01/05", 12, "Jorge");
		System.out.println("Quantidade Refeições Dia: " + fd.qtdVendidaDia());
		System.out.println("Quantidade Refeicao Cliente: " + fd.qtdRefeicoesPor("Leonardo"));
		System.out.println("Total Vendido: " + fd.valorTotalVendido());
		System.out.println("Total Vendido de Prato Feito: " + fd.valorTotalPratoFeito());
		System.out.println("Quantidade De Buffet dia: " + fd.qtdBuffets(14));
		fd.setDataRefeicaoDiari("01/05");
		fd.imprime();
	}

}
