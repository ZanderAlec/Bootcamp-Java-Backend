package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;
    
    public ListaTarefas(){
        this.tarefas = new HashSet<>(); 
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equals(descricao)){
                this.tarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas(Set<Tarefa> tarefas){
        if(tarefas != null){
            System.out.println(tarefas);
            return;
        }

        System.out.println("A lista está vazia!");
    }

    public int contarTarefas(){
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getConcluida()) concluidas.add(tarefa);
        }

        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        
        for (Tarefa tarefa : tarefas) {
            if(!tarefa.getConcluida()) pendentes.add(tarefa);
        }

        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        this.tarefas.removeAll(this.tarefas);
    }

    public static void main(String args[]){
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas(listaTarefas.tarefas);
        
        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");
        listaTarefas.adicionarTarefa("tarefa 4");
        listaTarefas.adicionarTarefa("tarefa 5");
        
        listaTarefas.exibirTarefas(listaTarefas.tarefas);
        System.out.println("tamanho: "+ listaTarefas.contarTarefas());
        
        listaTarefas.exibirTarefas(listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaConcluida("tarefa 1");
        listaTarefas.marcarTarefaConcluida("tarefa 2");
        listaTarefas.marcarTarefaConcluida("tarefa 3");
        
        listaTarefas.exibirTarefas(listaTarefas.obterTarefasConcluidas());
        
        listaTarefas.limparListaTarefas();
        
        listaTarefas.exibirTarefas(listaTarefas.tarefas);


    }
    
}
