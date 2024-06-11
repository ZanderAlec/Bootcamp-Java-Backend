package ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    public Map<LocalDate, Evento> listaEventos;

    public AgendaEventos(){
        this.listaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.listaEventos.put(data, new Evento(nome, atracao));
    }


    public void exibirAgenda(){
        //para poder ordenar os eventos na ordem crescente de datas, precisamos utilizar um treeMap.
        //localDate ja tem o método para comparação, assim ao passar a lista para o treeMap ela já estará organizada.
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.listaEventos);

        System.out.println(this.listaEventos);
    }



    public static void main(String args[]){
        AgendaEventos agendaEventos = new AgendaEventos();
    }


}
