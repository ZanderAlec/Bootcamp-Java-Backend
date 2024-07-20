package aula.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//identifica as entidades no jpa.
@Entity
            //"User" é reservado no h2 BD.
public class _User {

    //todas as entidades precisam ter um id.
    @Id
    //gera os ids automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //permite definir as configurações da coluna.
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User={"+
        "id="+id+
        ", name="+name+
        ", username="+username+
        ", password="+password+
        "}";
    }
}
