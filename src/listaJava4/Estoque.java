package listaJava4;

import java.util.HashMap;

public class Estoque {
	private HashMap<Integer, Produto> estoque;

	
	public Estoque() {
		estoque = new HashMap<Integer, Produto>();
	}


	public Estoque(HashMap<Integer, Produto> estoque) {
		super();
		this.estoque = estoque;
	}


	public HashMap<Integer, Produto> getEstoque() {
		return estoque;
	}


	public void setEstoque(HashMap<Integer, Produto> estoque) {
		this.estoque = estoque;
	}
	
	public void addProduto(Produto p) {
		estoque.put(1, p);
		System.out.println("Produto add!");
	}
	
	public void removeProduto(Integer chave) {
		for(int i = 0; i < estoque.size(); i++) {
			//if() {
				
			//}
		}
	}
}
