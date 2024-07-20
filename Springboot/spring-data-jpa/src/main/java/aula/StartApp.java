package aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import aula.model._User;
import aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        _User user = new _User();
        user.setName("Alex");
        user.setUsername("all3x");
        user.setPassword("123456");

        repository.save(user);
                        //retorna todas as instancias do objeto no banco.
        for(_User u:repository.findAll()){
            System.out.println(u);
        }
    }

}
