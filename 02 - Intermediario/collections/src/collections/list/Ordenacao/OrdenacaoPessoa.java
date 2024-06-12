package collections.list.Ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	// Atributo
	private List<Pessoa> pessoaList;

	// Método construtor
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPesoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}

	// Metodo para ordenar pessoas por idade
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPesoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPesoa("Nome 2", 30, 1.88);
		ordenacaoPessoa.adicionarPesoa("Nome 3", 25, 1.70);
		ordenacaoPessoa.adicionarPesoa("Nome 4", 17, 1.56);
		
		System.out.println("Ordenaçao por idade:\n" + ordenacaoPessoa.ordenarPorIdade());
		System.out.println("Ordenaçao por açtura:\n" + ordenacaoPessoa.ordenarPorAltura());
		
	}

}
