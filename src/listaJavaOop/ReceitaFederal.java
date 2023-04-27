package listaJavaOop;

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

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void add(Pessoa pessoa) {
		boolean achou = false;
		for(int i = 0; i < pessoas.size();i++) {
			if(pessoas.get(i) instanceof PessoaFisica && pessoa instanceof PessoaFisica) {
				PessoaFisica pf1 = (PessoaFisica) pessoas.get(i);
				PessoaFisica pf2 = (PessoaFisica) pessoa;
				if(pf1.getCpf().equals(pf2.getCpf())) {
					achou = true;
					break;
				}
			}
			
			if(pessoas.get(i) instanceof PessoaJuridica && pessoa instanceof PessoaJuridica) {
				PessoaJuridica pj1 = (PessoaJuridica) pessoas.get(i);
				PessoaJuridica pj2 = (PessoaJuridica) pessoa;
				if(pj1.getCnpj().equals(pj2.getCnpj())) {
					achou = true;
					break;
				}
			}
			
			if(!achou) {
				pessoas.add(pessoa);
				System.out.println("Pessoa Adicionada");
			}else {
				System.out.println("Pessoa Já Adicionada");
			}
		}
	}
}
