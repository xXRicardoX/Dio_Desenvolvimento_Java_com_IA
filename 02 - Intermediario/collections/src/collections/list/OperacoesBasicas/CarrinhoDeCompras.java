package collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;



public class CarrinhoDeCompras {
	private List<Item> itemLista;

	public CarrinhoDeCompras() {
		this.itemLista = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itemLista.add(new Item(nome, preco, quantidade));
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

	public double calcularValorTotal(){
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
		CarrinhoDeCompras listaItens = new CarrinhoDeCompras();

		listaItens.adicionarItem("Detergente", 25.50, 2);
		listaItens.adicionarItem("Sabonte", 0.75, 11);
		listaItens.adicionarItem("Refrigerante", 10.15, 10);
		System.out.println("Valor total: R$" + listaItens.calcularValorTotal());
		listaItens.exibirItens();
		listaItens.removerItem("Detergente");
		listaItens.exibirItens();
	}

}
