package br.senai.sc.rpg.model.service;

import br.senai.sc.rpg.model.dao.PersonagemDAO;
import br.senai.sc.rpg.model.entities.personagens.Personagem;

import java.util.Collection;

public class PersonagemService {

    public Collection<Personagem> buscarListaPersonagens(Integer codigoPessoa) {
        return new PersonagemDAO().buscarListaPersonagens(codigoPessoa);
    }
}
