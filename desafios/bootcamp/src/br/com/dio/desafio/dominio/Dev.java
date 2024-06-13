package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosIncritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(String nome){
        this.nome = nome;
        this.conteudosIncritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }


    public void progredir(){
        //pega o primeiro conteúdo
       Optional<Conteudo> conteudo =  this.conteudosIncritos.stream().findFirst();
       //verifica se o contéudo existe
       if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
       }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
       }
    }

    public double calcularXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }


    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }

}
