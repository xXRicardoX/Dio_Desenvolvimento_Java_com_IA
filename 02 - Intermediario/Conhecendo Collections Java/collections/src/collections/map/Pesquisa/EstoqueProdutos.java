package collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	// Atributo
	private Map<Long, Produto> estoqueProdutosMap;

	// construtor
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEsqoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEsqoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEsqoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		Double maiorPreco = Double.MIN_VALUE;
		for (Produto p : estoqueProdutosMap.values()) {
			if (p.getPreco() > maiorPreco) {
				produtoMaisCaro = p;
				maiorPreco = p.getPreco();
			}
		}
		return produtoMaisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		for (Produto p : estoqueProdutosMap.values()) {
			if (p.getPreco() < menorPreco) {
				produtoMaisBarato = p;
				menorPreco = p.getPreco();
			}
		}
		return produtoMaisBarato;
	}

	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		}

		return produtoMaiorQuantidadeValorNoEstoque;
	}

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		// Exibe o estoque vazio
		estoque.exibirProdutos();
		
		// Adiciona produtos ao estoque
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		estoque.adicionarProduto(3L, "Monitor", 10, 4000.0);
		estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
		
		// Exibir os produtos no estoque
		estoque.exibirProdutos();
		
		// Calcular e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
		
		// Obtem e exibe o produto mais caro
		Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);
		
		// Obtém e exibe o produto mais barato
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    System.out.println("Produto mais barato: " + produtoMaisBarato);

	    // Obtém e exibe o produto com a maior quantidade em valor no estoque
	    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}
}
