package treinoParaProvaPoo;

public class Ex2 {
	private String titulo;
	private String autor;
	private int numberExemplar;
	private boolean disponivel;
	
	
	public Ex2() {
		super();
	}

	public Ex2(String titulo, String autor, int numberExemplar, boolean disponivel) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numberExemplar = numberExemplar;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumberExemplar() {
		return numberExemplar;
	}

	public void setNumberExemplar(int numberExemplar) {
		this.numberExemplar = numberExemplar;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String toString() {
		return "Nome: " + titulo + "\n" + 
				"Autor: " + autor + "\n" + 
				"Number Exemplar: " + numberExemplar + "\n" + 
				"Disponivel: " + disponivel;
	}
}
