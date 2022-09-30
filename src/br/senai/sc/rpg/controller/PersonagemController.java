package br.senai.sc.rpg.controller;

import br.senai.sc.rpg.model.entities.personagens.Personagem;
import br.senai.sc.rpg.model.service.PersonagemService;

import java.util.Collection;

public class PersonagemController {

    public Collection<Personagem> buscarLista(Integer codigoPessoa) {
        PersonagemService service = new PersonagemService();
        return service.buscarListaPersonagens(codigoPessoa);
    }

    public void cadastrarPersonagem(String nome, double vida, int sabedoria, int inteligencia, int destreza, int forca,
                                    int constituicao, int carisma, Object classe) {
        Personagem personagem = Personagem.cadastrar(nome, vida, sabedoria, inteligencia, destreza, forca, constituicao, carisma, classe);
        PersonagemService service = new PersonagemService();
        service.cadastrarPersonagem(personagem);
    }
}
