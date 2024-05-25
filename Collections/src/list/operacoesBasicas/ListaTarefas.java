package list.operacoesBasicas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas;

    public static void main(String args[]){

        ListaTarefas listaTarefas = new ListaTarefas();
       
        listaTarefas.adicionarTarefa("Fazer compras");
        listaTarefas.adicionarTarefa("Organizar a despensa");
        listaTarefas.adicionarTarefa("Fazer o almoço");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
       

        listaTarefas.removerTarefa("Organizar a despensa");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


    }

    public ListaTarefas(){
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa t = new Tarefa(descricao);
        this.tarefas.add(t);
    }

    public void removerTarefa(String descricao){

        for(int i = 0; i < this.tarefas.size(); i++){
            if(this.tarefas.get(i).getDescricao() == descricao){
                this.tarefas.remove(i);
                break;
            }
        }
    
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }

    public void obterDescricoesTarefas(){
        
        for (Tarefa tarefa : tarefas) {
            System.out.println("* "+tarefa.getDescricao());
        }

    }
}
