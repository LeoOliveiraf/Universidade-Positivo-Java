package treinoParaProva;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReceitaFederal {
	private ArrayList<Pessoa> arrayPe;
	
	public ReceitaFederal() {
		arrayPe = new ArrayList<Pessoa>();
	}
	
	public ReceitaFederal(ArrayList<Pessoa> arrayPe) {
		super();
		this.arrayPe = arrayPe;
	}

	public ArrayList<Pessoa> getArrayPe() {
		return arrayPe;
	}

	public void setArrayPe(ArrayList<Pessoa> arrayPe) {
		this.arrayPe = arrayPe;
	}
	
	public void adicionarPessoa(Pessoa pessoa) {
		for(int i = 0; i < arrayPe.size(); i++) {
			if(pessoa instanceof PessoaFisica && arrayPe.get(i) instanceof PessoaFisica) {
				PessoaFisica pf1 = (PessoaFisica)arrayPe.get(i);
				PessoaFisica pf2 = (PessoaFisica)pessoa;
				if(pf1.getCpf().equals(pf2.getCpf())) {
					System.out.println("CPF já adicionado!");
				}else {
					arrayPe.add(pessoa);
					System.out.println("Adicionado com Sucesso!");
				}
			}
			
			if(pessoa instanceof PessoaJuridica && arrayPe.get(i) instanceof PessoaJuridica) {
				PessoaJuridica pj1 = (PessoaJuridica)arrayPe.get(i);
				PessoaJuridica pj2 = (PessoaJuridica)pessoa;
				if(pj1.getCnpj().equals(pj2.getCnpj())) {
					System.out.println("CNPJ já adicionado!");
				}else {
					arrayPe.add(pessoa);
					System.out.println("Adicionado com Sucesso!");
				}
					
			}
		}
		if(arrayPe.size() == 0) {
			arrayPe.add(pessoa);
		}
		
		
	}
	
	public void removerPessoa(String nome) {
		for(int i = 0; i < arrayPe.size(); i++) {
			if(arrayPe.contains(nome)) {
				arrayPe.remove(i);
				System.out.println("Removido com Sucesso!");
			}
		}
	}
	
	public int qtdPessoaFisica() {
		int contador = 0;
		for(int i = 0; i < arrayPe.size(); i++) {
			if(arrayPe.get(i) instanceof PessoaFisica) {
				contador++;
			}
		}
		return contador;
	}
	
	public int qtdPessoaJuridica() {
		int contador = 0;
		for(int i = 0; i < arrayPe.size(); i++) {
			if(arrayPe.get(i) instanceof PessoaJuridica) {
				contador++;
			}
		}
		return contador;
	}
	
	public double impostoPessoa(String nome) {
		for(int i=0; i < arrayPe.size();i++) {
			if(arrayPe.contains(nome)) {
				return arrayPe.get(i).calculaImposto(); 
			}else {
				System.out.println("Nome nao consta na Lista de Pessoas!");
			}
		}
		return -1;
	}
	
	public double calculaTotalImposto() {
		double imposto = 0;
		for(int i = 0; i < arrayPe.size(); i++) {
			imposto = imposto + arrayPe.get(i).calculaImposto();
		}
		return imposto;
	}
	
	public void imprime() {
		for(int i = 0; i < arrayPe.size();i++) {
			System.out.println(arrayPe.get(i).toString());
		}
	}
}
