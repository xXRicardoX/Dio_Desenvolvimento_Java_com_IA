package app.sistema;

import app.internet.NavegadorInternet;
import app.ligar.LigarTelefone;
import app.musica.ReprodutorMusical;

public class SistemaIphone implements ReprodutorMusical, LigarTelefone, NavegadorInternet {
	// Metodos de ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo Musica...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Musica..." + musica);
	}

	// Métodos de AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo a chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");

	}

	// Método de navegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba...");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página...");

	}

}
