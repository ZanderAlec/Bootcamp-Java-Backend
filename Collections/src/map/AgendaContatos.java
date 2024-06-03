package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos(){
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.contatos.isEmpty())
            this.contatos.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(this.contatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if(!this.contatos.isEmpty())
            numero =  this.contatos.get(nome);

        return numero;
    }

    public static void main(String args[]){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Pedro", 921674587);
        agenda.adicionarContato("Oliver", 998765623);
        agenda.adicionarContato("Maria", 907230808);

        agenda.exibirContatos();
        
        agenda.removerContato("Pedro");
        agenda.exibirContatos();

        System.out.println("numero: "+agenda.pesquisarPorNome("Oliver"));
    }
}
