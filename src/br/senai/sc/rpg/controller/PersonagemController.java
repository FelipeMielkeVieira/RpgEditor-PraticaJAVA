package br.senai.sc.rpg.controller;

import br.senai.sc.rpg.model.entities.personagens.Personagem;
import br.senai.sc.rpg.model.service.PersonagemService;

import java.util.Collection;

public class PersonagemController {

    public Collection<Personagem> buscarLista(Integer codigoPessoa) {
        PersonagemService service = new PersonagemService();
        return service.buscarListaPersonagens(codigoPessoa);
    }
}
