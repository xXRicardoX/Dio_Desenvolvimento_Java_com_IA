package collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	// atributo
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}

	public List<Livro> PesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicação() >= anoInicial && l.getAnoPublicação() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}

		return livrosPorIntervaloAnos;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
		catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4","Autor 4", 2000);
		
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
		System.out.println(catalogoLivros.PesquisarPorIntervaloAnos(2000, 2019));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}

}



