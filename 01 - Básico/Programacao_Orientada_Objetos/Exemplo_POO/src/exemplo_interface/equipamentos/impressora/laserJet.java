package exemplo_interface.equipamentos.impressora;

public class laserJet implements Impressora{

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO LASERJET");
		
	}

}
