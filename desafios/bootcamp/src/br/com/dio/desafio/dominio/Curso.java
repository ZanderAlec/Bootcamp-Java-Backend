package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
       return XP_PADRAO * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso{titulo="+this.titulo
                +", descricao:"+this.descricao+
                ", cargaHoraria:"+this.cargaHoraria
                +"}";
    }

    
}
