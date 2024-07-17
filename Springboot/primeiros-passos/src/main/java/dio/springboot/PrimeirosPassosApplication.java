package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.scopes.SistemaMensagem;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);

		//Não se pode utilizar nenhuma instrução após o spring ser inicializado.
		//Não se utiliza new, mas sim beans.

		// Calculadora calculadora = new Calculadora();
		// System.out.println("O resultado é: "+ calculadora.somar(2, 7));
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			//nova instância
			sistema.enviarConfirmacaoCadastro();
			//utiliza a instância existente.
			sistema.enviarMensagemBoasVindas();

			//singleton:utlizada a instância existente.
			//prototype: criará uma nova instância.
			sistema.enviarConfirmacaoCadastro();
		};
	}

}
