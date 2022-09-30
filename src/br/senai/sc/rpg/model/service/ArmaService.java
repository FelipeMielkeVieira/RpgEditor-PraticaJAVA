package br.senai.sc.rpg.model.service;

import br.senai.sc.rpg.model.dao.ArmaDAO;
import br.senai.sc.rpg.model.entities.armas.Arma;

import java.util.Collection;

public class ArmaService {
    public Collection<Arma> buscarListaArmas() {
        return new ArmaDAO().buscarListaArmas();
    }
}
