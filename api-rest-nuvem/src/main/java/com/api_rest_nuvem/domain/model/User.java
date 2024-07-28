package com.api_rest_nuvem.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name =  "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public Long getId() {
        return id;
    }

    public List<News> getNews() {
        return news;
    }

    public String getNome() {
        return nome;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
