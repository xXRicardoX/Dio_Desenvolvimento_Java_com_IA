package collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	// Atributos
	private List<Integer> numeros;

	// construtor
	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	// adicionar numero
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}

	// metodo calcular os numeros inteiros
	public int calcularSoma() {
		int soma = 0;
		for (Integer numero : numeros) {
			soma += numero;
		}
		return soma;
	}

	// Metodo para encontrar o Maior numero
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer numero : numeros) {
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	// Metodo para encontrar o Maior numero
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer numero : numeros) {
				if (numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	// Metodo exibir numeros
	public void exibirNumeros() {
		if (!numeros.isEmpty()) {
			System.out.println(this.numeros);
		} else {
			System.out.println("A lista está vazia");
		}

	}

	public static void main(String[] args) {
		// Criando uma instância da classe SomaNumeros
		SomaNumeros somar = new SomaNumeros();

		// Adicionando os numeros a lista
		somar.adicionarNumero(1500);
		somar.adicionarNumero(998);
		somar.adicionarNumero(3020);
		somar.adicionarNumero(1000);

		// Exibir os numeros da lista
		System.out.println("Números adicionados:");
		somar.exibirNumeros();

		// Encontrar o maior numero
		System.out.println("O maior numero é: " + somar.encontrarMaiorNumero());

		// Encontrar o menor numero
		System.out.println("O menor numero é: " + somar.encontrarMenorNumero());

		// Somando os numeros
		System.out.println("Valor da soma: " + somar.calcularSoma());

	}

}
