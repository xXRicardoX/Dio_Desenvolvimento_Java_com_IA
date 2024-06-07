package pilares_poo;

public class Autodromo  {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("QLB125");
		//jeep.ligar();
		
		Moto xre = new Moto();
		
		xre.setChassi("123BRE");
		// xre.ligar();
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
	}
	
}
