package pilares_poo;

public class Carro extends Veiculo {
	public void ligar() {
		// Encapsulado
		confereCambio();
		confereCombustivel();
		
		System.out.println("Carro ligado");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo cambio");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}

}
