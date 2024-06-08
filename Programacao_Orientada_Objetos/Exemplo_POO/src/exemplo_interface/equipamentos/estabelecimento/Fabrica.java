package exemplo_interface.equipamentos.estabelecimento;

import exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interface.equipamentos.impressora.DeskJet;
import exemplo_interface.equipamentos.impressora.Impressora;
import exemplo_interface.equipamentos.impressora.laserJet;
import exemplo_interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}

}
