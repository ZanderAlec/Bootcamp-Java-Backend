package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
                            /**
                             Serve pra indicar que os beans devem ser executados após o contexto carregar.
                             */
//permite a detecção dos beans    
//utilizado quando se tem acesso ao código fonte.  
//quando se tem se cria utilizando @bean na classe main ou, mais limpo, numa classe específica para os beans.                      
@Component                            
public class MyApp implements CommandLineRunner{

    //Components não podem criar dependências utilizando o new.
    //Autowired indica a injeção de dependência.
    //Calculadora agr é uma dependência.
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: "+ calculadora.somar(2, 7));
    }
      
}
