package br.senai.sc.rpg.model.factory;

import br.senai.sc.rpg.model.entities.personagens.*;

public class PersonagemFactory {

    public Personagem getPersonagem(String nome, Double vida, Double dano, Double mana, Integer sabedoria, Integer inteligencia, Integer destreza, Integer forca, Integer constituicao, Integer carisma, Integer nivel, Integer classe) {
        switch (classe) {
            case 1 -> {
                return new Guerreiro(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            case 2 -> {
                return new Ladino(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            case 3 -> {
                return new Mago(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            default -> {
                return new Paladino(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
        }
    }
}
