package dio.springboot.propertyValues;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//mesma utilidade do @component, porém para beans de configuração.
@Configuration
//é preciso definir as propriedades utilizadas por esse component.
@ConfigurationProperties(prefix  = "remetente")
public class RemetenteValues {

    private String nome;
    private String email;
    private List<Long> telefones;

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }

}
