package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private Set<Dev> devInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFinal = this.dataInicio.plusDays(45);
        this.devInscritos = new HashSet<>();
        this.conteudos = new  LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devInscritos, bootcamp.devInscritos) &&  Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome, descricao, dataInicio, dataFinal, devInscritos, conteudos);
    }


}
