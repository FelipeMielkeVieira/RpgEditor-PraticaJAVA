package br.senai.sc.rpg.model.factory;

import br.senai.sc.rpg.model.entities.armas.*;

public class ArmaFactory {

    public Arma getArma(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo, String tipoArma) {
        switch (tipoArma) {
            case "ADAGA" -> {
                return new Adaga(danoMinimo, danoMaximo, valor, nome, codigo);
            }
            case "CAJADO" -> {
                return new Cajado(danoMinimo, danoMaximo, valor, nome, codigo);
            }
            case "ESCUDO" -> {
                return new Escudo(danoMinimo, danoMaximo, valor, nome, codigo);
            }
            case "ESPADA" -> {
                return new Espada(danoMinimo, danoMaximo, valor, nome, codigo);
            }
        }
    }
}
