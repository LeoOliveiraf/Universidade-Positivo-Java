package Exercicio2OrientacaoObjeto;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private Integer totPaginas;
	private Integer pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Metodo to String
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}
	
	//Metodo Construtor
	public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	//Metodo Get e Set
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
	public Integer getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(Integer totPaginas) {
		this.totPaginas = totPaginas;
	}
	public Integer getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(Integer page) {
		
		
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}	
	}
