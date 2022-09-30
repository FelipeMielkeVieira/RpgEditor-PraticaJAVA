package br.senai.sc.rpg.model.factory;

import br.senai.sc.rpg.model.entities.personagens.*;

public class PersonagemFactory {

    public Personagem getPersonagem(String nome, Double vida, Integer sabedoria, Integer inteligencia, Integer destreza, Integer forca, Integer constituicao, Integer carisma, Integer nivel, String classe) {
        switch (classe) {
            case "GUERREIRO" -> {
                return new Guerreiro(nome, vida, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            case "LADINO" -> {
                return new Ladino(nome, vida, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            case "MAGO" -> {
                return new Mago(nome, vida, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
            default -> {
                return new Paladino(nome, vida, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel);
            }
        }
    }
}
