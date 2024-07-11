package dio_springboot.spring_ioc_di_beans_autowired;

import dio_springboot.spring_ioc_di_beans_autowired.app.ConversorJson;
import dio_springboot.spring_ioc_di_beans_autowired.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocDiBeansAutowiredApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIocDiBeansAutowiredApplication.class, args);
	}

	public CommandLineRunner run(ConversorJson conversor) throws Exception{
		return args -> {
			String json = "{\\\"cep\\\": \\\"01001-000\\\",\\\"logradouro\\\": \\\"Praça da Sé\\\",\\\"localidade\\\": \\\"São Paulo\\\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
