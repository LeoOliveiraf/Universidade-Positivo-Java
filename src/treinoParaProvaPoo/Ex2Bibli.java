package treinoParaProvaPoo;

import java.util.ArrayList;

public class Ex2Bibli extends Ex2{
	 private ArrayList<Ex2> biblioteca  = new ArrayList<Ex2>();

	public Ex2Bibli(ArrayList<Ex2> biblioteca) {
		super();
		this.biblioteca = biblioteca;
	}

	public Ex2Bibli() {
		super();
	}

	public ArrayList<Ex2> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(ArrayList<Ex2> biblioteca) {
		this.biblioteca = biblioteca;
	}
	 
	public void adicionar(Ex2 livro) {
		for(int i = 0; i < biblioteca.size(); i++) {
			if(biblioteca.contains(livro)) {
				System.out.println("Já adicionado!");
			}else {
				biblioteca.add(livro);
				System.out.println("Adicionado com Sucesso!");
			}
		}
	}
	
	public void remover(int numberExemplar) {
		for(int i = 0; i < biblioteca.size(); i++) {
			if(biblioteca.get(i).getNumberExemplar() == numberExemplar) {
				biblioteca.remove(i);
			}else {
				System.out.println("Não Encontrado!");
			}
		}
	}
	
	public void empresta(String titulo) {
		
	}
	
	public void qtdLivrosEmpresta() {
		
	}
}
	

