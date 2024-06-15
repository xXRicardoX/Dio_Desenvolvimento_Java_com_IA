package collections.introducao.exemplo.comparableXcomparator;

public class Livro implements Comparable<Livro>{
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}
	
	// Usado para ordenar livros por ano
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}
	
	// Método getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAno() {
		return ano;
	}

}
