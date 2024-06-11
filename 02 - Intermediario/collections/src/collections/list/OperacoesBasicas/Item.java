package collections.list.OperacoesBasicas;

public class Item {
	private String nome;
	private Double preco;
	private int quantidade;
	
	// Construtor
	public Item(String nome, Double preco, int quantidade) {	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Metodo get
	public String getNome() {
		return nome;
	}


	public Double getPreco() {		
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Item nome= " + nome + ", preco=" + preco + ", quantidade=" + quantidade + " \n";
	}
	
	
	
	
	
	
	
	

	
	
	
	
	

}
