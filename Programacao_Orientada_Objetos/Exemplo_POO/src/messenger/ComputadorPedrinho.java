package messenger;

import messenger.app.FacebookMessenger;
import messenger.app.MSNMessenger;
import messenger.app.ServicoMensagemInstantanea;
import messenger.app.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		 * Não se sabe qual app
		 * mas qualquer um deverá enviar e receber mensagem
		 */
		
		String appEscolhido ="tlg";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
