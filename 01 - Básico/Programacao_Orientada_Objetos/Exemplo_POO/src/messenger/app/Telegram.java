package messenger.app;

public class Telegram extends ServicoMensagemInstantanea{	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico pelo Telegram");
		
	}

}
