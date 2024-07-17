package dio.springboot.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    //scope determina a forma como as instâncias serão utilizadas.
    //Singleton: A mesma instância é utilizada para qualquer contexto.
    //Prototype: Várias instâncias podem ser criadas a depender da necessidade.
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
