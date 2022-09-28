package br.senai.sc.rpg.model.entities.personagens;

public enum Classe {

    GUERREIRO("Guerreiro"), LADINO("Ladino"), MAGO("Mago"), PALADINO("Clerigo");

    String nome;

    Classe(String nome) {
        this.nome = nome;
    }
}
