package treinoAbstract;

import java.util.ArrayList;

public class Cidade {
	private ArrayList<EmissaoCarbono> cidade;
	
	public Cidade() {
		cidade = new ArrayList<EmissaoCarbono>();
	}

	public Cidade(ArrayList<EmissaoCarbono> cidade) {
		super();
		this.cidade = cidade;
	}

	public ArrayList<EmissaoCarbono> getCidade() {
		return cidade;
	}

	public void setCidade(ArrayList<EmissaoCarbono> cidade) {
		this.cidade = cidade;
	}
	
	public void addEmissao(EmissaoCarbono ec) {
		cidade.add(ec);
		System.out.println("Add com Sucesso!");
	}
	
	public void removeEmissao(EmissaoCarbono ec) {
		for(int i = 0; i < cidade.size(); i++) {
			if(cidade.get(i).equals(ec)) {
				cidade.remove(i);
				System.out.println("Removido Sucesso");
				break;
			}
		}
	}
	
	public void buscar(String combustivel, int numeroPessoas) {
		int predio = 0;
		int carro = 0;
		for(int i = 0; i < cidade.size(); i++) {
			
			if(cidade.get(i) instanceof Predio) {
				Predio predio1 = (Predio) cidade.get(i);
				if(predio1.getNumeroPessoas() == numeroPessoas) {
					predio++;
				}
			}
			if(cidade.get(i) instanceof Carro) {
				Carro carro1 = (Carro) cidade.get(i);
				if(carro1.getCombustivel().equals(combustivel)) {
					carro++;
				}
			}
		}
		System.out.println("Quantidade de pessoas iguais no mesmo Predio: " + predio);
		System.out.println("Quantidade de carros iguais com mesmo Combustivel: " + carro);
	}
	
	public void calculaEmissaoMensal() {
		double soma = 0;
		for(int i = 0; i < cidade.size(); i++) {
			soma += cidade.get(i).quantidadeEmitida();
		}
		System.out.println("Emissao Mensal é de " + soma + " por mes!");
	}
}
