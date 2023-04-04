package HerancaOOPExercicios;

public class MainHeranca3 {
	public static void main(String[] args) {
		
		Imovel imovel = new Imovel();
		imovel.setEndereco("Rua Pernambuco, 1086, Londrina");
		imovel.setPreco(10500);
		System.out.println("Imovel: " + imovel.dadosImovel());
		
		Novo novo = new Novo();
		novo.setEndereco("Rua Pernambuco, 1086, Londrina");
		novo.setPreco(10500);
		novo.setPorcentagem(20);
		System.out.println("\nNovo: " + novo.imprime());
		novo.novoImovel();
		
		Velho velho = new Velho();
		velho.setEndereco("Rua Pernambuco, 1086, Londrina");
		velho.setPreco(10500);
		velho.setDescontPorcent(50);
		System.out.println("\nVelho: " + velho.imprime());
		velho.velhoImovel();
	}
}