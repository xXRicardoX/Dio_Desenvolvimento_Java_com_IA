package collections.list.Pesquisa;

public class Livro {
	// atributos
	private String titulo;
	private String autor;
	private int anoPublicação;

	// Construtor
	public Livro(String titulo, String autor, int anoPublicação) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicação = anoPublicação;
	}

	// Método Get
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicação() {
		return anoPublicação;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicação=" + anoPublicação + "]";
	}

}
