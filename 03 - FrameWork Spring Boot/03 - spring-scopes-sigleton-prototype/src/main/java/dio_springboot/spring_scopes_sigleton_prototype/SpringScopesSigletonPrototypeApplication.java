package dio_springboot.spring_scopes_sigleton_prototype;

import dio_springboot.spring_scopes_sigleton_prototype.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringScopesSigletonPrototypeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringScopesSigletonPrototypeApplication.class, args);
	}

	public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}
