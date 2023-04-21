package treinoParaProvaPoo;

import java.util.ArrayList;

public class ReceitaFederal {
	private ArrayList<Pessoa> pessoas;
	
	
	
	public ReceitaFederal() {
		pessoas = new ArrayList<Pessoa>();
	}



	public ReceitaFederal(ArrayList<Pessoa> pessoas) {
		super();
		this.pessoas = pessoas;
	}



	public void addPessoa(Pessoa pessoa) {
		boolean achou = false;
		for(int i = 0; i < pessoas.size();i++) {
			
			if(pessoas.get(i) instanceof Fisica && pessoa instanceof Fisica) {
				Fisica pf = (Fisica) pessoas.get(i);
				Fisica pf2 = (Fisica) pessoa;
				if(pf.getCpf().equals(pf2.getCpf())) {
					achou = true;
					break;
				}
			}
			
			
			if(pessoas.get(i) instanceof Juridica && pessoa instanceof Juridica) {
				Juridica pj = (Juridica) pessoas.get(i);
				Juridica pj2 = (Juridica) pessoa;
				if(pj.getCnpj().equals(pj2.getCnpj())) {
					achou = true;
					break;
				}
			}
		}
		if(!achou) {
			pessoas.add(pessoa);
			System.out.println("Pessoa add!");
		}else {
			System.out.println("Pessoia ja Adicionada");
		}
	}
	
	
	public void remover(String nome) {
		for(int i = 0; i < pessoas.size();i++) {
			if(pessoas.get(i).getNome().contains(nome)) {
				pessoas.remove(i);
				System.out.println("Removido Sucesso");
			}
		}
	}
	
	public int qtdFisica() {
		int cont = 0;
		for(int i = 0; i < pessoas.size();i++) {
			if(pessoas.get(i) instanceof Fisica) {
				cont++;
			}
		}
		return cont;
	}
	
	public int qtdJuridica() {
		int cont = 0;
		for(int i = 0; i < pessoas.size();i++){
			if(pessoas.get(i) instanceof Juridica) {
				cont++;
			}
		}
		return cont;
	}
	
	public double calcImp(String nome) {
		double imposto = 0;
		for(int i = 0; i < pessoas.size();i++) {
			if(pessoas.get(i).getNome().contains(nome)) {
				imposto =  pessoas.get(i).calculaImposto();
				System.out.println(imposto);
				break;
			}else {
				System.out.println("Não encontrado");
			}
		}
		return imposto;
	}
	
	public double totalImposto() {
		double totalImposto = 0;
		for(int i  = 0; i < pessoas.size();i++) {
			if(pessoas.get(i) instanceof Fisica) {
				totalImposto += pessoas.get(i).calculaImposto();
			}
			if(pessoas.get(i) instanceof Juridica) {
				totalImposto += pessoas.get(i).calculaImposto();
			}
		}
		return totalImposto;
	}
	
	public String imprime() {
		String str = "";
		for(int i  = 0; i < pessoas.size();i++) {
			str += pessoas.get(i).toString() + "\n";
		}
		return str;
	}
}
