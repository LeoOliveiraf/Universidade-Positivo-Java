package treinoAbstract;

public class MainCarbono {

	public static void main(String[] args) {
		
		Predio p1 = new Predio(50, true, 100, 50);
		Predio p2 = new Predio(100, false, 80, 40);
		Carro c1 = new Carro("gasolina", 50);
		Carro c2 = new Carro("diesel", 100);
		
		Cidade cidade = new Cidade();
		cidade.addEmissao(p1);
		cidade.addEmissao(p2);
		cidade.addEmissao(c2);
		cidade.addEmissao(c1);
		cidade.calculaEmissaoMensal();
		cidade.removeEmissao(c1);
		cidade.calculaEmissaoMensal();
		cidade.buscar("diesel", 50);
	}

}
