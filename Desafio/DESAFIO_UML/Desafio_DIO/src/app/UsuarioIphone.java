package app;

import app.sistema.SistemaIphone;

public class UsuarioIphone {

	public static void main(String[] args) {

		SistemaIphone usuarioIphone = new SistemaIphone();

		String appEscolhido = "msc";

		if (appEscolhido.equals("msc")) {
			System.out.println("Musica");
			usuarioIphone.tocar();
			usuarioIphone.selecionarMusica("Don't cry - Guns N' Roses");
			usuarioIphone.pausar();
		} else if (appEscolhido.equals("ligar")) {
			System.out.println("Telefone");
			usuarioIphone.ligar("123456789");
			usuarioIphone.atender();
			usuarioIphone.iniciarCorreioVoz();
		} else if (appEscolhido.equals("net")) {
			System.out.println("Internet");
			usuarioIphone.exibirPagina("https://www.example.com");
			usuarioIphone.adicionarNovaAba();
			usuarioIphone.atualizarPagina();
		} else {
			System.out.println("Somente letra minuscula");
		}
	}
}
