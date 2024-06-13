package collections.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	// Atributos
	private String nome;
	private int codigoConvite;
	
	// Construtor
	public Convidado(String nome, int codigoConvite) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	
	// Metodo Get
	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}	

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Convidado convidado)) return false;
		return getCodigoConvite() == convidado.getCodigoConvite();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite, nome);
	}


	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
	
	
	
	
	

}
