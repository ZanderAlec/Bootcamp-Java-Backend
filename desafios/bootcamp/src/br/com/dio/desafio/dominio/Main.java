package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Conteudo curso1 = new Curso("Curso java", "descricao curso java", 8);
        Conteudo curso2 = new Curso("Curso Js", "descricao curso js", 8);
    
        System.out.println(curso1);
        
        Conteudo mentoria1 = new Mentoria("Mentoria java", "Descricao mentoria java", LocalDate.now());
        
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("Fernando");        
        Dev dev2 = new Dev("Rafael");


        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        dev1.progredir();

        
        
        
    }
}
