package br.senai.sc.rpg.controller;

import br.senai.sc.rpg.model.entities.armas.Arma;
import br.senai.sc.rpg.model.service.ArmaService;

import java.util.Collection;

public class ArmaController {
    public Collection<Arma> buscarLista() {
        ArmaService service = new ArmaService();
        return service.buscarListaArmas();
    }
}
