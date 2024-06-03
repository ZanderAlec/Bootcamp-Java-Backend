package Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida(){
        return this.concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tarefa {descricao: "+descricao+", concluida: "+concluida+"}";
    }
}
