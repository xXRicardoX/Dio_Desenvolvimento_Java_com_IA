package messenger.app;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico pelo Facebook Messenger");
		
	}

}
