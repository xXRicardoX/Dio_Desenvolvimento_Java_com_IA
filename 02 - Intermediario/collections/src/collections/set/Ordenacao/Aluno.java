package collections.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	// Atributos
	private String nome;
	private Long matricula;
	private double media;

	public Aluno(String nome, Long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMatricula());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno aluno))
			return false;
		return Objects.equals(getMatricula(), aluno.getMatricula());
	}

	@Override
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return nome.compareTo(aluno.getNome());
	}

	@Override
	public String toString() {
		return "Aluno{" + "nome='" + nome + '\'' + ", matricula=" + matricula + ", media=" + media + '}';
	}

}

class ComparatorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getMedia(), o2.getMedia());
	}
	
}
