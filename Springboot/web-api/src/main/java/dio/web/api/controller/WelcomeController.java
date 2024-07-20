package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//transforma a classe em um component do tipo Rest Controller
//Cada controller é associado a um serviço/contexto da aplicação.
//Os controllers apenas direcionam para as classes que possuem as informações
//eles não possuem regras de negócio.
@RestController
public class WelcomeController {

    //Por ser um controller, alguns dos seus métodos são recursos/serviços http
    //esses métodos em específico devem ser mapeados.
    @GetMapping
    public String welcome(){
        return "Welcome To My Spring Boot Web API";
    }
}
