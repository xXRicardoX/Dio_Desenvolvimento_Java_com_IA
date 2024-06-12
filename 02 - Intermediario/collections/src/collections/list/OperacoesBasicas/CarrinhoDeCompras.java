package collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemLista;

	public CarrinhoDeCompras() {
		this.itemLista = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemLista.add(item);

	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<Item>();
		for (Item i : itemLista) {
			// Comparativo com a String nome
			if (i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		itemLista.removeAll(itensParaRemover);
	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!itemLista.isEmpty()) {
			for (Item item : itemLista) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista esta vazia");
		}

	}

	public void exibirItens() {
		System.out.println(itemLista);
	}

	public static void main(String[] args) {
		// Criando uma instância do carrinho de compras
		CarrinhoDeCompras listaItens = new CarrinhoDeCompras();

		// Adicionando itens ao carrinho
		listaItens.adicionarItem("Detergente", 25.50d, 2);
		listaItens.adicionarItem("Sabonte", 0.75d, 11);
		listaItens.adicionarItem("Refrigerante", 10.15d, 10);
		listaItens.adicionarItem("Sucrilhos", 10.15d, 10);

		// Exibindo os itens no carrinho
		listaItens.exibirItens();

		// Removendo um item do carrinho
		listaItens.removerItem("Detergente");

		// Exibindo os itens atualizados no carrinho
		listaItens.exibirItens();

		// Calculando e exibindo o valor total da compra
		System.out.println("Valor total: R$" + listaItens.calcularValorTotal());

	}

}
