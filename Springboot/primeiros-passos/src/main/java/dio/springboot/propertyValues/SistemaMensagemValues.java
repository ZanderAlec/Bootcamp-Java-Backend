package dio.springboot.propertyValues;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagemValues implements CommandLineRunner{

    //value permite acessar os valores padrão definidos no application.properties.
    //é possível definir um valor default caso o nome especificado não exista no arquivo.
    @Value("${nome:default value}")
    String nome;

    //Quando os values atendem a um cenário é específico,
    //ao invés de passar os valores explicitamente, é melhor criar um bean de configuração.
    //que poderá ser utilizado em outros components com atributos semelhantes.
    @Autowired
    RemetenteValues remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() 
        +"\nE-mail: "+ remetente.getEmail() 
        +"\nTelefones pra contato: "+ remetente.getTelefones());
    }
    
}
