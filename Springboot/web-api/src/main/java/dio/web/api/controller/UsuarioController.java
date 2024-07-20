package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;

@RestController
//define a url base para acessar os recursos desse controller
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    //é preciso definir as rotas quando se tem mais de um mapeamento.
    @GetMapping("")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    //ao colocar o nome do parâmetro entre {} na uri
    //podemos acessa-lo.
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    //requisições http só realizam metodos get.
    //outros métodos precisam de um client http para serem realizados.
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
                        //pega o json no body do site e converte para um objeto.
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
